package com.foodiego.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodiego.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	
}