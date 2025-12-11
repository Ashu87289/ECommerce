package com.ashu.Ecommerce.repository;

import com.ashu.Ecommerce.entity.Cart;
import com.ashu.Ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {

}
