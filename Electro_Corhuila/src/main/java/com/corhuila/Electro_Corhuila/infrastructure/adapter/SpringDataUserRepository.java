package com.corhuila.Electro_Corhuila.infrastructure.adapter;

import com.corhuila.Electro_Corhuila.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUserRepository extends JpaRepository<User, Long> {
}
