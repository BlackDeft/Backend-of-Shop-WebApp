package com.JacekStachecki.OnlineShop.Service;

import com.JacekStachecki.OnlineShop.Entity.Product;
import com.JacekStachecki.OnlineShop.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct(){
        return productRepository.findAll();
    }
     public void productEdit(){

     }
     public void productAdd(){
    }
    public void productDelete(){

    }
}
