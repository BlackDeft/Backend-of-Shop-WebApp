package com.JacekStachecki.OnlineShop.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transactions {

    @Id
    int idTransaction;
    Date dot;
    int idUser;
    int Products;
    double price;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "idUser")
    User usert;
}
