package com.JacekStachecki.OnlineShop.Service;

import com.JacekStachecki.OnlineShop.Entity.Transactions;
import com.JacekStachecki.OnlineShop.Repository.TransactionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionsService {

    public final TransactionsRepository transactionsRepository;

    public TransactionsService(TransactionsRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }

    public List<Transactions> getTransactions(){
        return transactionsRepository.findAll();
    }

    public void transactionsAdd(){

    }
    public void transactionsEdit(){

    }
    public void transactionsDelete(){

    }
}
