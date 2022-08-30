package com.inditex.prices.controller;

import com.inditex.prices.model.PriceResponse;
import com.inditex.prices.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/prices")
public class PriceController {

    private final PriceService service;

    @Autowired
    public PriceController(PriceService service) {
        this.service = service;
    }

    @GetMapping("/{brandId}")
    public ResponseEntity<PriceResponse> getPrices(
            @PathVariable Long brandId,
            @RequestParam String date,
            @RequestParam Long productId) {
        PriceResponse price = this.service.getPrice(brandId, date, productId);
        return new ResponseEntity<>(price,HttpStatus.OK);
    }
}
