package com.lexlabs.configserver.productcatalog.repository;

import com.lexlabs.configserver.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
