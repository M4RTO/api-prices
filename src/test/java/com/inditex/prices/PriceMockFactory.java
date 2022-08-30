package com.inditex.prices;

import com.inditex.prices.entity.Brand;
import com.inditex.prices.entity.Price;
import com.inditex.prices.entity.PriceList;
import com.inditex.prices.entity.Product;
import com.inditex.prices.model.BrandResponse;
import com.inditex.prices.model.PriceListResponse;
import com.inditex.prices.model.PriceResponse;
import com.inditex.prices.model.ProductResponse;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class PriceMockFactory {

    public static PriceResponse getPriceResponse() {
        return PriceResponse.builder()
                .id(1L)
                .brand(BrandResponse.builder().id(1L).description("ZARA").build())
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
                .brand(BrandResponse.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceListResponse.builder().id(1L).description("Tarifa 1").build())
                .product(ProductResponse.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(35.50))
                .currency("EUR")
                .priority(0)
                .build();
    }

    public static List<Price> getPriceListEntityByTimeTenAm() {
        return List.of(Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(35.50))
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .currency("EUR")
                .priority(0)
                .build());
    }

    public static PriceResponse getPriceResponseExpectedBySixTeenPMWithParams() {
        return PriceResponse.builder()
                .id(2L)
                .brand(BrandResponse.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 15, 0))
                .endDate(LocalDateTime.of(2020, Month.JUNE, 14, 18, 30))
                .priceList(PriceListResponse.builder().id(2L).description("Tarifa 2").build())
                .product(ProductResponse.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(25.45))
                .currency("EUR")
                .priority(1)
                .build();
    }

    public static List<Price> getPriceListEntityByTimeSixteenWithParams() {
        return List.of(
                Price.builder()
                        .id(2L)
                        .brand(Brand.builder().id(1L).description("ZARA").build())
                        .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 15, 0))
                        .endDate(LocalDateTime.of(2020, Month.JUNE, 14, 18, 30))
                        .priceList(PriceList.builder().id(2L).description("Tarifa 2").build())
                        .product(Product.builder().id(35455L).description("Trench impermeable").build())
                        .price(BigDecimal.valueOf(25.45))
                        .currency("EUR")
                        .priority(1)
                        .build(),
                Price.builder()
                        .id(1L)
                        .brand(Brand.builder().id(1L).description("ZARA").build())
                        .startDate(LocalDateTime.of(2020, Month.JUNE, 6, 0, 0))
                        .endDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59,59))
                        .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                        .product(Product.builder().id(35455L).description("Trench impermeable").build())
                        .price(BigDecimal.valueOf(35.50))
                        .currency("EUR")
                        .priority(0)
                        .build()

        );
    }

    public static PriceResponse getPriceResponseExpectedByTwentyOnePMWithParams() {
        return PriceResponse.builder()
                .id(1L)
                .brand(BrandResponse.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceListResponse.builder().id(1L).description("Tarifa 1").build())
                .product(ProductResponse.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(35.50))
                .currency("EUR")
                .priority(0)
                .build();
    }

    public static List<Price> getPriceListEntityByTimeTwentyOneWithParams() {
        return List.of(Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(35.50))
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .currency("EUR")
                .priority(0)
                .build());
    }

    public static PriceResponse getPriceResponseExpectedByTenAmPMDFifteenDayWithParams() {
        return PriceResponse.builder()
                .id(3L)
                .brand(BrandResponse.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 15, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 15, 11, 0, 0))
                .priceList(PriceListResponse.builder().id(3L).description("Tarifa 3").build())
                .product(ProductResponse.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(30.50))
                .currency("EUR")
                .priority(1)
                .build();
    }

    public static List<Price> getPriceListEntityByTenAmPMDFifteenDayWithParams() {
        return List.of(Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(35.50))
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .currency("EUR")
                .priority(0)
                .build(),
        Price.builder()
                .id(3L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 15, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 15, 11, 0, 0))
                .priceList(PriceList.builder().id(3L).description("Tarifa 3").build())
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(30.50))
                .currency("EUR")
                .priority(1)
                .build());
    }

    public static PriceResponse getPriceResponseExpectedByTwentyOnePMDSixteenDayWithParams() {
        return PriceResponse.builder()
                .id(4L)
                .brand(BrandResponse.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 15, 16, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59))
                .priceList(PriceListResponse.builder().id(4L).description("Tarifa 4").build())
                .product(ProductResponse.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(38.95))
                .currency("EUR")
                .priority(1)
                .build();
    }

    public static List<Price> getPriceListEntityByTwentyOnePMSixteenDayWithParams() {
        return List.of(Price.builder()
                        .id(1L)
                        .brand(Brand.builder().id(1L).description("ZARA").build())
                        .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                        .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                        .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                        .price(BigDecimal.valueOf(35.50))
                        .product(Product.builder().id(35455L).description("Trench impermeable").build())
                        .currency("EUR")
                        .priority(0)
                        .build(),
                Price.builder()
                        .id(4L)
                        .brand(Brand.builder().id(1L).description("ZARA").build())
                        .startDate(LocalDateTime.of(2020, Month.JUNE, 15, 16, 0, 0))
                        .endDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59))
                        .priceList(PriceList.builder().id(4L).description("Tarifa 4").build())
                        .product(Product.builder().id(35455L).description("Trench impermeable").build())
                        .price(BigDecimal.valueOf(38.95))
                        .currency("EUR")
                        .priority(1)
                        .build());
    }
}
