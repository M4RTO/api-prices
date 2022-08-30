package com.inditex.prices.service.Impl;

import com.inditex.prices.converter.PriceConverter;
import com.inditex.prices.entity.Price;
import com.inditex.prices.entity.PriorityComparator;
import com.inditex.prices.exception.PricesNotFoundException;
import com.inditex.prices.model.PriceResponse;
import com.inditex.prices.respository.PriceRepository;
import com.inditex.prices.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


@Component
public class PriceServiceImpl implements PriceService {

    private final PriceRepository repository;

    private final PriceConverter converter;

    private static final String FORMAT_DATE = "yyyy-MM-dd HH:mm";

    @Autowired
    public PriceServiceImpl(PriceRepository repository, PriceConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public PriceResponse getPrice(Long brandId, String date, Long productId) {
        LocalDateTime dateTime = parseLocalDateTime(date);
        List<Price> priceList = getPricesByParams(brandId, productId, dateTime);
        PriorityQueue<Price> queue = new PriorityQueue<>(new PriorityComparator());

        priceList.forEach(queue::offer);

        Price first = queue
                .stream()
                .findFirst()
                .orElseThrow(() -> new PricesNotFoundException("Not Found Price with these params"));

        return converter.convert(first);
    }

    private List<Price> getPricesByParams(Long brandId, Long productId, LocalDateTime dateTime) {
        return Optional.of(repository.findAllByBetweenDatesAndProductIdAndBrandId(dateTime, productId, brandId))
                .orElseThrow(() -> new PricesNotFoundException("Not Found Price with these params"));
    }

    private static LocalDateTime parseLocalDateTime(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE);
        return LocalDateTime.parse(date, formatter);
    }
}
