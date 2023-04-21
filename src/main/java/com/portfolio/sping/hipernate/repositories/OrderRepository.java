package com.portfolio.sping.hipernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.sping.hipernate.entitites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	

}
