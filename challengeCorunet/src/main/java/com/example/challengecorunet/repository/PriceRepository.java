package com.example.challengecorunet.repository;

import com.example.challengecorunet.model.dto.PriceGetDto;
import com.example.challengecorunet.model.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {

    @Query("SELECT new com.example.challengecorunet.model.dto.PriceGetDto " +
            "(p.product.id, p.brand.id, p.priceList, p.startDate, p.endDate, p.price) " +
            "FROM Price p WHERE p.product.id = :productId AND p.brand.id = :brandId AND :date BETWEEN p.startDate AND p.endDate " +
            "ORDER BY p.priority DESC")
    List<PriceGetDto> findByProductIdAndBrandIdAndDate(Date date, Integer productId, Integer brandId);

}
