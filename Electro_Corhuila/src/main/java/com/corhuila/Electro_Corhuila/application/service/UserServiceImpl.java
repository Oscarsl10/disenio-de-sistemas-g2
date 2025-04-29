package com.corhuila.Electro_Corhuila.application.service;

import com.corhuila.Electro_Corhuila.domain.model.User;
import com.corhuila.Electro_Corhuila.domain.ports.in.UserService;
import com.corhuila.Electro_Corhuila.domain.ports.out.ITarifaRepository;
import com.corhuila.Electro_Corhuila.domain.ports.out.IUserRepository;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final IUserRepository userRepository;
    private final ITarifaRepository tarifaRepository;

    public UserServiceImpl(IUserRepository userRepository, ITarifaRepository tariffRepository) {
        this.userRepository = userRepository;
        this.tarifaRepository = tariffRepository;
    }

    @Override
    public User save(User user) {
        // Asignar tarifa automática según estrato
        tarifaRepository.findByEstrato(user.getEstrato())
                .ifPresent(user::setTarifa);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
