package com.inditex.prices.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.inditex.prices.entity.Brand;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PriceResponse {

    private Long id;
    private BrandResponse brand;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private PriceListResponse priceList;
    private ProductResponse product;
    private Integer priority;
    private BigDecimal price;
    private String currency;

}
