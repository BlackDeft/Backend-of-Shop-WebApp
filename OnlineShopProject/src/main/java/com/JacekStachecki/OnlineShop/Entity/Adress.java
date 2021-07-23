package com.JacekStachecki.OnlineShop.Entity;


import javax.persistence.Id;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Adress {

    @Id
    int idAdress;
    String city;
    String postalCode;
    String NIP;
    long phoneNumber;
    String street;
    int homeNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "idUser")
    User user;


}
