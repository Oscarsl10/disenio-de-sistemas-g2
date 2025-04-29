package com.corhuila.Electro_Corhuila.domain.ports.out;

import com.corhuila.Electro_Corhuila.domain.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface IUserRepository {

    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
}
