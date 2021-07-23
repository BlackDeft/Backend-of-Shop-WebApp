package com.JacekStachecki.OnlineShop.Service;


import com.JacekStachecki.OnlineShop.Entity.User;
import com.JacekStachecki.OnlineShop.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    List<User> getUser(){
        return userRepository.findAll();
    }

    public void userEdit(){

    }
    public void userAdd(){

    }
    public void userDelete(){
        
    }

}
