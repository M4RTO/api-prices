package com.inditex.prices.service;


import com.inditex.prices.model.PriceResponse;

public interface PriceService {

    PriceResponse getPrice(Long brandId, String date, Long productId);
}

