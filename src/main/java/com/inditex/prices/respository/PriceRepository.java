package com.inditex.prices.respository;

import com.inditex.prices.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Long> {

    @Query("SELECT p FROM Price p WHERE :date between p.startDate and p.endDate and p.product.id=:productId and p.brand.id=:brandId")
    List<Price> findAllByBetweenDatesAndProductIdAndBrandId(LocalDateTime date, Long productId, Long brandId);

}
