package com.JacekStachecki.OnlineShop.Service;

import com.JacekStachecki.OnlineShop.Entity.Cart;
import com.JacekStachecki.OnlineShop.Repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    public final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getCart(){
        return cartRepository.findAll();
    }
    public void cartEdit(){

    }
    public void cartAdd(){

    }
    public void carDelete(){

    }
}
