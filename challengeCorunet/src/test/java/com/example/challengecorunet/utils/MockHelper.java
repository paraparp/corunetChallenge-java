package com.example.challengecorunet.utils;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

public class MockHelper {


    public static Date getDateFromString(String dateString) throws ParseException {
        return DateUtils.parseDate(dateString,
                "yyyy-MM-dd'T'HH:mm:ss");
    }
}
