package com.inditex.prices.service;


import com.inditex.prices.PriceMockFactory;
import com.inditex.prices.converter.PriceConverter;
import com.inditex.prices.model.PriceResponse;
import com.inditex.prices.respository.PriceRepository;
import com.inditex.prices.service.Impl.PriceServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@DisplayName("Price Service")
@ExtendWith(MockitoExtension.class)
public class PriceServiceImplTest {

    @Mock
    PriceRepository repository;

    @Spy
    PriceConverter converter;

    @InjectMocks
    PriceServiceImpl service;


    /**
     * Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA)
     */
    @Test
    void getPriceByTenAmAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceResponseExpectedBy10();

        when(repository.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTimeTenAm());

        PriceResponse all = service.getPrice(1L,"2020-06-14 10:00",35455L);

        Assertions.assertEquals(expected, all);
    }

    /**
     * petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
     */
    @Test
    void getPriceBySixteenPMAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceResponseExpectedBySixTeenPMWithParams();

        when(repository.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTimeSixteenWithParams());

        PriceResponse all = service.getPrice(1L,"2020-06-14 16:00",35455L);

        Assertions.assertEquals(expected, all);
    }

    /**
     * petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
     */
    @Test
    void getPriceByTwentyOnePMAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceResponseExpectedByTwentyOnePMWithParams();

        when(repository.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTimeTwentyOneWithParams());

        PriceResponse all = service.getPrice(1L,"2020-06-14 21:00",35455L);

        Assertions.assertEquals(expected, all);
    }

    /**
     * petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    void getPriceByTenAmPMDFifteenDayAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceResponseExpectedByTenAmPMDFifteenDayWithParams();

        when(repository.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTenAmPMDFifteenDayWithParams());

        PriceResponse all = service.getPrice(1L,"2020-06-15 10:00",35455L);

        Assertions.assertEquals(expected, all);
    }

    /**
     * petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)
     */
    @Test
    void getPriceByTwentyOnePMDSixteenDayAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceResponseExpectedByTwentyOnePMDSixteenDayWithParams();

        when(repository.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTwentyOnePMSixteenDayWithParams());

        PriceResponse all = service.getPrice(1L,"2020-06-16 21:00",35455L);

        Assertions.assertEquals(expected, all);
    }
}
