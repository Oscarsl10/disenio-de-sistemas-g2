package com.corhuila.Electro_Corhuila.infrastructure.adapter;

import com.corhuila.Electro_Corhuila.domain.model.User;
import com.corhuila.Electro_Corhuila.domain.ports.out.IUserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryAdapter implements IUserRepository {

    private final SpringDataUserRepository springDataUserRepository;

    public UserRepositoryAdapter(SpringDataUserRepository springDataUserRepository) {
        this.springDataUserRepository = springDataUserRepository;
    }

    @Override
    public User save(User user) {
        return springDataUserRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return springDataUserRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return springDataUserRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        springDataUserRepository.deleteById(id);
    }
}
