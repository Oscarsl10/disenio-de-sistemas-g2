package com.corhuila.Electro_Corhuila.infrastructure.config;

import com.corhuila.Electro_Corhuila.application.service.UserServiceImpl;
import com.corhuila.Electro_Corhuila.domain.ports.in.UserService;
import com.corhuila.Electro_Corhuila.domain.ports.out.ITarifaRepository;
import com.corhuila.Electro_Corhuila.domain.ports.out.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public UserService userService(IUserRepository userRepository, ITarifaRepository tarifaRepository) {
        return new UserServiceImpl(userRepository, tarifaRepository);
    }
}
