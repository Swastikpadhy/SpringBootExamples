package com.order.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.order.entity.Order;
import com.order.jpa.OrderRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@Transactional
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepo;
	
	@Override
	public List<Order> getOrders() {
		log.info("In the OrderServiceImpl :: method ::: getOrders() ");
		return orderRepo.findAll() ;
	}

	@Override
	public Optional<Order> getOrder(Long id) {
		log.info("In the OrderServiceImpl :: method ::: getOrder() ");
		return orderRepo.findById(id);
	}

	@Override
	public Order addorder(Order order) {
		log.info("In the OrderServiceImpl :: method ::: addorder() ");
		return orderRepo.save(order);
	}

	@Override
	public void deleteOrder(Long id) {
		log.info("In the OrderServiceImpl :: method ::: deleteOrder() ");
		 orderRepo.deleteById(id);
		
	}

	

	

}
