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

    public Adress(int idAdress, String city, String postalCode, String NIP, long phoneNumber, String street, int homeNumber, User user) {
        this.idAdress = idAdress;
        this.city = city;
        this.postalCode = postalCode;
        this.NIP = NIP;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.homeNumber = homeNumber;
        this.user = user;
    }

    public Adress(String city, String postalCode, String NIP, long phoneNumber, String street, int homeNumber, User user) {
        this.city = city;
        this.postalCode = postalCode;
        this.NIP = NIP;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.homeNumber = homeNumber;
        this.user = user;
    }

    public Adress(String city, String postalCode, long phoneNumber, String street, int homeNumber, User user) {
        this.city = city;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.homeNumber = homeNumber;
        this.user = user;
    }

    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "idAdress=" + idAdress +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", NIP='" + NIP + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                ", user=" + user +
                '}';
    }
}
