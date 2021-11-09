package com.example.challengecorunet.service;

import com.example.challengecorunet.errors.exceptions.PriceNotFoundException;
import com.example.challengecorunet.model.dto.PriceGetDto;
import com.example.challengecorunet.utils.MockHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@AutoConfigureMockMvc
public class PriceGetServiceShould {


    private static final String TEST_1_DATE = "2020-06-14T10:00:00";
    private static final String TEST_2_DATE = "2020-06-14T16:00:00";
    private static final String TEST_3_DATE = "2020-06-14T21:00:00";
    private static final String TEST_4_DATE = "2020-06-15T10:00:00";
    private static final String TEST_5_DATE = "2020-06-16T21:00:00";

    private static final Integer DEFAULT_PRODUCT_ID = 35455;

    private static final Integer DEFAULT_BRAND_ID = 1;


    private static final Integer PRICE_LIST_1 = 1;
    private static final Integer PRICE_LIST_2 = 2;
    private static final Integer PRICE_LIST_3 = 3;
    private static final Integer PRICE_LIST_4 = 4;
    @Autowired
    private PriceGetService priceGetService;


    @Test
    public void retrieve_requested_price_test_1() throws ParseException, PriceNotFoundException {
        Date date = MockHelper.getDateFromString(TEST_1_DATE);
        PriceGetDto priceGetDto = priceGetService.execute(date, DEFAULT_PRODUCT_ID, DEFAULT_BRAND_ID);
        assertEquals(PRICE_LIST_1, priceGetDto.getPriceList());
    }

    @Test
    public void retrieve_requested_price_test_2() throws ParseException, PriceNotFoundException {
        Date date = MockHelper.getDateFromString(TEST_2_DATE);
        PriceGetDto priceGetDto = priceGetService.execute(date, DEFAULT_PRODUCT_ID, DEFAULT_BRAND_ID);
        assertEquals(PRICE_LIST_2, priceGetDto.getPriceList());
    }

    @Test
    public void retrieve_requested_price_test_3() throws ParseException, PriceNotFoundException {
        Date date = MockHelper.getDateFromString(TEST_3_DATE);
        PriceGetDto priceGetDto = priceGetService.execute(date, DEFAULT_PRODUCT_ID, DEFAULT_BRAND_ID);
        assertEquals(PRICE_LIST_1, priceGetDto.getPriceList());
    }

    @Test
    public void retrieve_requested_price_test_4() throws ParseException, PriceNotFoundException {
        Date date = MockHelper.getDateFromString(TEST_4_DATE);
        PriceGetDto priceGetDto = priceGetService.execute(date, DEFAULT_PRODUCT_ID, DEFAULT_BRAND_ID);
        assertEquals(PRICE_LIST_3, priceGetDto.getPriceList(), priceGetDto.getPriceList());
    }

    @Test
    public void retrieve_requested_price_test_5() throws ParseException, PriceNotFoundException {
        Date date = MockHelper.getDateFromString(TEST_5_DATE);
        PriceGetDto priceGetDto = priceGetService.execute(date, DEFAULT_PRODUCT_ID, DEFAULT_BRAND_ID);
        assertEquals(PRICE_LIST_4, priceGetDto.getPriceList());
    }


}