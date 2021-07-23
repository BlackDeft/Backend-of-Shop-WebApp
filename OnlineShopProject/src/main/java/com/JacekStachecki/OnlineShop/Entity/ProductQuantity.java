package com.JacekStachecki.OnlineShop.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductQuantity {
    @Id
    int id;
    @ManyToOne
    Cart cart;
    @ManyToOne
    Product product;
    int quantity;
}
