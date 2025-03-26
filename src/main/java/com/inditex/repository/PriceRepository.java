package com.inditex.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.inditex.model.entitys.Prices;

public interface PriceRepository extends JpaRepository<Prices, Long>{

	@Query("SELECT p FROM Prices p WHERE p.brandId = :brandId AND p.productId = :productId AND :date >= p.startDate AND :date <= p.endDate")
	List<Prices> getPrices(@Param("brandId") int brandId, @Param("productId") int productId, @Param("date") Timestamp date);

}
