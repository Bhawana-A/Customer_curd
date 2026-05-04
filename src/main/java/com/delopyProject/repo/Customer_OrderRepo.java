package com.delopyProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delopyProject.entity.Customer_Order;



@Repository
public interface Customer_OrderRepo extends JpaRepository<Customer_Order, Long> {

}
