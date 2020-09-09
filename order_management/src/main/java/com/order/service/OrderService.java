package com.order.service;

import java.util.List;
import java.util.Optional;

import com.order.entity.Order;

public interface OrderService {
	List<Order> getOrders();
	Optional<Order> getOrder(Long id);
	Order addorder(Order order);
	public void deleteOrder(Long id);
	
}
