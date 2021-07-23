package com.JacekStachecki.OnlineShop.Service;

import com.JacekStachecki.OnlineShop.Entity.ProductQuantity;
import com.JacekStachecki.OnlineShop.Repository.ProductQuantityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductQuantityService {

    public final ProductQuantityRepository productQuantityRepository;

    public ProductQuantityService(ProductQuantityRepository productQuantityRepository) {
        this.productQuantityRepository = productQuantityRepository;
    }

    List<ProductQuantity> getProductQuantity(){
        return productQuantityRepository.findAll();
    }
    public void productQuantityEdit(){

    }
    public void productQuantityAdd(){

    }
    public void productQuantityDelete(){

    }

}
