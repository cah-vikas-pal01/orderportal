package com.orderportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderportal.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
