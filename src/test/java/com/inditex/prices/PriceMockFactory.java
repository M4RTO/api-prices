package com.inditex.prices;

import com.inditex.prices.entity.Brand;
import com.inditex.prices.entity.Price;
import com.inditex.prices.entity.PriceList;
import com.inditex.prices.model.PriceListResponse;
import com.inditex.prices.model.PriceResponse;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class PriceMockFactory {

    public static PriceResponse getPriceResponse() {
        return PriceResponse.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2021, Month.JANUARY, 1, 10, 0, 0, 0))
                .endDate(LocalDateTime.of(2021, Month.JANUARY, 1, 10, 0, 0, 0))
                .priceList(PriceListResponse.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(14.50))
                .currency("EUR")
                .priority(1)
                .build();
    }

    public static PriceResponse getPriceResponseExpectedBy10() {
        return PriceResponse.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 6, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 12, 23, 59, 59))
                .priceList(PriceListResponse.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(35.50))
                .currency("EUR")
                .priority(0)
                .build();
    }

    public static List<Price> getPriceListEntityByTimeTenAm() {
        return List.of(Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 6, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 12, 23, 59, 59))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(35.50))
                .currency("EUR")
                .priority(0)
                .build());
    }
}
