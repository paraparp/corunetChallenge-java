package com.example.challengecorunet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PriceGetDto {

    private Integer productId;
    private Integer brandId;
    private Integer priceList;
    private Date startDate;
    private Date endDate;
    private BigDecimal price;





}
