package com.gottit.TCPProject.Service;

import com.gottit.TCPProject.Model.User;
import com.gottit.TCPProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService  {

    @Autowired
    UserRepository userRepository;
    public User create(Long user_id, String user_name,  String password){

        User user = new User(user_id, user_name, password);
        userRepository.save(user);

        return user;
    }







}
