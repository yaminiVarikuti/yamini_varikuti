package com.demo.controller;
import com.demo.pojo.Order;

import com.demo.service.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/orders"))
	 public List<Order> getAllOrders(){
		 
		 return orderService.getAllOrders();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/orders/add"))
	public void addOrder(@RequestBody Order order)
	{
		orderService.addOrder(order);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/orders/{id}"))
	public void updateOrder(@PathVariable Integer id,@RequestBody Order order)
	{
		orderService.updateOrder(id,order);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/orders/{id}"))
	public void DeleteOrder(@PathVariable Integer id)
	{
		orderService.deleteOrder(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/orders/{id}")
	public Order findOrderById(@PathVariable int id) {
		return orderService.getOrderById(id);
	}
	
	 
	 
	
}
