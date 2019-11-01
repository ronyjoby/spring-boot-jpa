package com.springboot.buildingblocks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.buildingblocks.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
