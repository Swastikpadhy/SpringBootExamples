package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.Order;
import com.order.exception.OrderNotFoundException;
import com.order.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	OrderService service;

	@GetMapping
	public List<Order> getOrderList() {
	    return service.getOrders();
	} 
	
	@GetMapping("{id}")
	public Order getOrder(@PathVariable Long id) {
	    return service.getOrder(id).orElseThrow(OrderNotFoundException::new);
	    		
	} 
	
	@PostMapping
	public Order addOrder(@RequestBody Order order) {
	    return  service.addorder(order) ;
	}  
	
	@DeleteMapping("/{id}")
	public void deleteOrder(@PathVariable Long id) {
		
		service.getOrder(id).orElseThrow(OrderNotFoundException::new);
	    service.deleteOrder(id);
	    
	} 
}
