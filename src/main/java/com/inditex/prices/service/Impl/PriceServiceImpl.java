package com.inditex.prices.service.Impl;

import com.inditex.prices.converter.PriceConverter;
import com.inditex.prices.model.PriceResponse;
import com.inditex.prices.respository.PriceRepository;
import com.inditex.prices.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class PriceServiceImpl implements PriceService {

    private PriceRepository repository;

    private PriceConverter converter;

    @Autowired
    public PriceServiceImpl(PriceRepository repository, PriceConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public PriceResponse getPrice(Long brandId, String date, Long productId) {
        repository.findAllByBetweenDatesAndProductIdAndBrandId()
        return null;
    }
}
