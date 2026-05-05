package com.delopyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delopyProject.entity.Customer_Order;
import com.delopyProject.service.CustomerServices;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/deploy")
public class CustomerController {
	
	@Autowired
	private CustomerServices services;
	
	
	@GetMapping
	public List<Customer_Order> getAllCustomer(){
		return services.getAllData();
	}
	
	@PostMapping
	public Customer_Order createCustomer(@RequestBody Customer_Order cusotmer) {
		return services.createData(cusotmer);
	}
	
	@PutMapping("/{id}")
	public Customer_Order updateCutomer(@PathVariable Long id , @RequestBody Customer_Order customer){
		return services.updateCustomer(id, customer);
	}
	
	
	@GetMapping("/{id}")
	public Customer_Order getByOne(@PathVariable Long id) {
		return services.getOne(id);
	}

	@DeleteMapping("/{id}")
	public String deleteCustomer(Long id) {
		return services.deleteOrder(id);
	}
}
