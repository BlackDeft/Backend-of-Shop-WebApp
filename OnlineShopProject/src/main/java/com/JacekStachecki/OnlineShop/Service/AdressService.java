package com.JacekStachecki.OnlineShop.Service;

import com.JacekStachecki.OnlineShop.Entity.Adress;
import com.JacekStachecki.OnlineShop.Repository.AdressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressService {

    public final AdressRepository adressRepository;


    public AdressService(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }
    public List<Adress> getAdress(){
        return adressRepository.findAll();
    }

    public void adressEdit(){

    }
    public void adressAdd(){

    }
    public void adressDelete(){

    }
}
