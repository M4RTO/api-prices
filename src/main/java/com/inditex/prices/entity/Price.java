package com.inditex.prices.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Brand brand;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @OneToOne(cascade = CascadeType.ALL)
    private PriceList priceList;

    @OneToOne(cascade = CascadeType.ALL)
    private Product product;

    private Integer priority;

    private BigDecimal price;

    private String currency;

}
