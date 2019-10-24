package com.orderportal.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.orderportal.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	

}
