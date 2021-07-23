package com.JacekStachecki.OnlineShop.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cart {

    @Id
    int idCart;
    @OneToMany(mappedBy = "cart")
    Set<ProductQuantity> products = new HashSet<>();
    @OneToOne
    User user;
}
