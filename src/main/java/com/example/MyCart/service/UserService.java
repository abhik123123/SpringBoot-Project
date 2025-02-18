package com.example.MyCart.service;

import com.example.MyCart.entity.User;
import com.example.MyCart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

//    public User updateUser(Long id, User updatedUser) {
//        return userRepository.findById(id).map(user -> {
//            user.setUserName(updatedUser.getUserName());
//            user.setUserEmail(updatedUser.getUserEmail());
//            user.setUserPassword(updatedUser.getUserPassword());
//            user.setUserPhone(updatedUser.getUserPhone());
//            user.setUserPicture(updatedUser.getUserPicture());
//            user.setUserAddress(updatedUser.getUserAddress());
//            return userRepository.save(user);
//        }).orElseThrow(() -> new RuntimeException("User with ID " + id + " not found"));
//    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
