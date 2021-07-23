package com.JacekStachecki.OnlineShop.Repository;

import com.JacekStachecki.OnlineShop.Entity.ProductQuantity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductQuantityRepository extends JpaRepository<ProductQuantity, Integer> {
}
