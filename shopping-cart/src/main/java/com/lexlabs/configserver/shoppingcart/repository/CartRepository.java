package com.lexlabs.configserver.shoppingcart.repository;

import com.lexlabs.configserver.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
