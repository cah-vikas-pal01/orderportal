package com.orderportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.orderportal.entity.Order;
import com.orderportal.mapper.OrderVO;
import com.orderportal.mapper.Search;
import com.orderportal.repository.ItemRepository;
import com.orderportal.service.OrderService;
import io.swagger.annotations.Api;

/**
 * This class contains all the end point of the order related operations.
 */
@Api
@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	ItemRepository itemRepository;
	
	/**
	 * End point to save order.
	 * 
	 */	
	
	@PostMapping("/save")
	public void addOrder(@RequestBody OrderVO order) {
	     
		orderService.addOrder(order);
		
	}
	
	/**
	 * End point to get detail of order.
	 * @return {@link Order}
	 */
	@GetMapping("/{id}")
	  public Order getOrderDetail(@PathVariable("id") Long id ) {
		
	      return orderService.getOrderDetail(id);
		
	}
	
	/**
	 * End point to search order for customer.
	 * @return {@link List<Order>}
	 */
	@PostMapping("/search")
	 public List<Order> searchOrder(@RequestBody Search search) {
		
		return orderService.searchOrder(search);
	}
	
}
