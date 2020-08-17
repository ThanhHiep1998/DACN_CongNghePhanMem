package com.example.hoteladmin.service;

import com.example.hoteladmin.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> getAllUser();

    User save(User type);

    Optional<User> findOne(Long id);

    void delete(Long id);
}
