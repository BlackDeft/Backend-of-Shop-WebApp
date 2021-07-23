package com.JacekStachecki.OnlineShop.Repository;

import com.JacekStachecki.OnlineShop.Entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions,Integer> {
}
