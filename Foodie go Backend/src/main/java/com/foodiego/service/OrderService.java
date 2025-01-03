package com.foodiego.service;
import java.util.List;

import com.foodiego.entity.TransactionDetails;



public interface OrderService {
	TransactionDetails createTransaction(Double amount);
}