package com.JacekStachecki.OnlineShop.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {

    @Id
    int idProduct;
    String description;
    String name;
    String producer;
    double price;
    int quantity;
    @ManyToMany(mappedBy = "enrolledProduct")
    Set<Cart> carts = new HashSet<>();
}
