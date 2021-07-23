package com.JacekStachecki.OnlineShop.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cart {

    @Id
    int idCart;
    int idProduct;
    int quantity;

    @ManyToMany
    @JoinTable(
            name = "cart_enrolled",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    Set<Product> enrolledProduct = new HashSet<>();
    @OneToOne
    User user;
}
