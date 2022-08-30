package com.inditex.prices.model;

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
public class PriceResponse {

    private Long id;
    private Brand brand;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private PriceListResponse priceList;
    private ProductResponse product;
    private Integer priority;
    private BigDecimal price;
    private String currency;

}
