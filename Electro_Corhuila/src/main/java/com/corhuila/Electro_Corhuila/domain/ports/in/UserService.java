package com.corhuila.Electro_Corhuila.domain.ports.in;

import com.corhuila.Electro_Corhuila.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
}
