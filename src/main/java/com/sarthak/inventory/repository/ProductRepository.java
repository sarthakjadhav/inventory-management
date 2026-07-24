package com.sarthak.inventory.repository;

import com.sarthak.inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
