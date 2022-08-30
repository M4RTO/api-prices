package com.inditex.prices.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inditex.prices.PriceMockFactory;
import com.inditex.prices.exception.PricesNotFoundException;
import com.inditex.prices.service.PriceService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@DisplayName("Weather Controller")
@WebMvcTest(PriceController.class)
public class PriceControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private PriceService service;

    private static final String URL= "/api/v1/prices";

    @Test
    void getAll() throws Exception {
        final var expected =
                objectMapper.writeValueAsString(PriceMockFactory.getPriceResponse());

        when(service.getPrice(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceResponse());

        mockMvc.perform(get(URL + "/1?date=2020-12-31T23.59.59&productId=35455"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(expected));
    }

    @Test
    @DisplayName("When I get all prices must be thrown exception because there are not data")
    void getPricesException() throws Exception {

        when(service.getPrice(any(),any(),any()))
                .thenThrow(new PricesNotFoundException("Not Found Prices with these params"));

        mockMvc.perform(get(URL))
                .andDo(print())
                .andExpect(status().isNotFound());
    }
}
