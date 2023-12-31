package com.emarket.emarket.repositories;
import com.emarket.emarket.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}