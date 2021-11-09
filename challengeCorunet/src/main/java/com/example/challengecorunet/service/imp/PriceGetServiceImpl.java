package com.example.challengecorunet.service.imp;

import com.example.challengecorunet.errors.exceptions.PriceNotFoundException;
import com.example.challengecorunet.model.dto.PriceGetDto;
import com.example.challengecorunet.repository.PriceRepository;
import com.example.challengecorunet.service.PriceGetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PriceGetServiceImpl implements PriceGetService {

    final private PriceRepository priceRepository;


    /**
     * Find first price sorted by priority and filtered by Product ID and Brand ID between price Dates
     */
    @Override
    public PriceGetDto execute(Date date, Integer productId, Integer brandId) throws PriceNotFoundException {
        List<PriceGetDto> priceList = priceRepository.findByProductIdAndBrandIdAndDate(date, productId, brandId);
        return priceList.stream().findFirst().orElseThrow(PriceNotFoundException::new);
    }
}
