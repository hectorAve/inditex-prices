package com.app.inditex_prices.adapter.out.db.repository;

import com.app.inditex_prices.adapter.out.db.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

}
