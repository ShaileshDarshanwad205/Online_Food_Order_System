package com.foodiego.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodiego.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
	public Payment findByOrderId(long orderId);
	
}
