package com.inditex.prices.converter;

import com.inditex.prices.entity.Brand;
import com.inditex.prices.entity.Price;
import com.inditex.prices.entity.PriceList;
import com.inditex.prices.entity.Product;
import com.inditex.prices.model.BrandResponse;
import com.inditex.prices.model.PriceListResponse;
import com.inditex.prices.model.PriceResponse;
import com.inditex.prices.model.ProductResponse;
import org.springframework.stereotype.Component;


@Component
public class PriceConverter {

    public PriceResponse convert(Price price) {
        return PriceResponse.builder()
                .id(price.getId())
                .priceList(convertPriceList(price.getPriceList()))
                .currency(price.getCurrency())
                .brand(convertBrand(price.getBrand()))
                .priority(price.getPriority())
                .startDate(price.getStartDate())
                .endDate(price.getEndDate())
                .product(convertProduct(price.getProduct()))
                .price(price.getPrice())
                .build();
    }

    private ProductResponse convertProduct(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .description(product.getDescription())
                .build();
    }

    private BrandResponse convertBrand(Brand brand) {
        return BrandResponse.builder()
                .id(brand.getId())
                .description(brand.getDescription())
                .build();
    }

    private PriceListResponse convertPriceList(PriceList priceList) {
        return PriceListResponse.builder()
                .id(priceList.getId())
                .description(priceList.getDescription())
                .build();
    }
}
