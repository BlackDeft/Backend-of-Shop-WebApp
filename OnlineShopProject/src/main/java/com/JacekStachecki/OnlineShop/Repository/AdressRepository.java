package com.JacekStachecki.OnlineShop.Repository;

import com.JacekStachecki.OnlineShop.Entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Integer> {
}
