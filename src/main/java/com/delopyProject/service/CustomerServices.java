package com.delopyProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delopyProject.entity.Customer_Order;
import com.delopyProject.repo.Customer_OrderRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServices {

	@Autowired
	private Customer_OrderRepo repo;
	
	public List<Customer_Order> getAllData(){
		return repo.findAll();
	}
	
	public Customer_Order createData(Customer_Order order) {
		return repo.save(order);
	}
	
	public Customer_Order getOne(Long id) {
		return repo.findById(id).orElseThrow(()-> new RuntimeException("Customer Order not found"));
	}
	
	public Customer_Order updateCustomer(Long id , Customer_Order or) {
		return repo.findById(id).map((a)->{
			a.setName(or.getName());
			a.setOrderDish(or.getOrderDish());
			a.setEmail(or.getEmail());
			return repo.save(a);
		}).orElseThrow(()-> new RuntimeException("Customer not found"));
	}
	
	
	public String deleteOrder(Long id) {
		repo.findById(id).orElseThrow(()-> new RuntimeException("Order not found"));
		repo.deleteById(id);
		return "Data delete Sucessful";
	}
}
