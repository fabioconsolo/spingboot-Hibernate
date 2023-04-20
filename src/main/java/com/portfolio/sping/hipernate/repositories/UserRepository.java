package com.portfolio.sping.hipernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.sping.hipernate.entitites.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
