package com.JacekStachecki.OnlineShop.Repository;

import com.JacekStachecki.OnlineShop.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
