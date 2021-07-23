package com.JacekStachecki.OnlineShop.Entity;


import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @NotNull
    int idUser;
    @NotNull
    String login;
    @NotNull
    String password;
    @NotNull
    String name;
    @NotNull
    String surname;
    @NotNull
    String email;
    @OneToMany(mappedBy="user")
    Set<Adress> adress = new HashSet<>();
    @OneToOne
    Cart cart;
    @OneToMany(mappedBy = "usert")
    Set<Transactions> transactions = new HashSet<>();


}
