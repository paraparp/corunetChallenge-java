package com.example.challengecorunet.controller;

import com.example.challengecorunet.errors.exceptions.PriceNotFoundException;
import com.example.challengecorunet.model.dto.PriceGetDto;
import com.example.challengecorunet.service.PriceGetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/challengecorunet")
public class PriceGetController {

    private final PriceGetService priceGetService;

    @GetMapping("/prices")
    public ResponseEntity<PriceGetDto> getPrice(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") Date date,
            @RequestParam Integer productId,
            @RequestParam Integer brandId) throws PriceNotFoundException {
        return ResponseEntity.ok().body(priceGetService.execute(date, productId, brandId));

    }

}
