package com.portfolio.sping.hipernate.repositories;




import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.sping.hipernate.entitites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	

}
