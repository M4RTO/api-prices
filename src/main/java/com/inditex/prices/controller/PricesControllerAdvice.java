package com.inditex.prices.controller;

import com.inditex.prices.exception.ApiResponse;
import com.inditex.prices.exception.PricesNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PricesControllerAdvice {

    @ExceptionHandler(PricesNotFoundException.class)
    public ResponseEntity<ApiResponse> handle(Exception e) {

        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .reason(e.getMessage())
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }
}
