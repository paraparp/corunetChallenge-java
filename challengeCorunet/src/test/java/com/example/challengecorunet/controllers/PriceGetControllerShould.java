package com.example.challengecorunet.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class PriceGetControllerShould {

    private static final String ENDPOINT = "/challengecorunet/prices?productId=35455&brandId=1&date=";

    private static final String TEST_1_DATE = "2020-06-14T10:00:00";
    private static final String TEST_2_DATE = "2020-06-14T16:00:00";
    private static final String TEST_3_DATE = "2020-06-14T21:00:00";
    private static final String TEST_4_DATE = "2020-06-15T10:00:00";
    private static final String TEST_5_DATE = "2020-06-16T21:00:00";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void return_status_ok_on_get_price_test1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT + TEST_1_DATE).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void return_status_ok_on_get_price_test2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT + TEST_2_DATE).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void return_status_ok_on_get_price_test3() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT + TEST_3_DATE).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void return_status_ok_on_get_price_test4() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT + TEST_4_DATE).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void return_status_ok_on_get_price_test5() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT + TEST_5_DATE).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


}