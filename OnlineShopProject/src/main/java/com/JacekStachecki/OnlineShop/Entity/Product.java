package com.JacekStachecki.OnlineShop.Entity;

import javax.persistence.*;
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
    @OneToMany(mappedBy = "product")
    Set<ProductQuantity> product = new HashSet<>();
}
