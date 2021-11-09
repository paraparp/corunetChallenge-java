package com.example.challengecorunet.service;

import com.example.challengecorunet.errors.exceptions.PriceNotFoundException;
import com.example.challengecorunet.model.dto.PriceGetDto;

import java.util.Date;

public interface PriceGetService {

    PriceGetDto execute(Date date, Integer productId, Integer brandId) throws PriceNotFoundException;

}
