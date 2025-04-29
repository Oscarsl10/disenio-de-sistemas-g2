package com.corhuila.Electro_Corhuila.infrastructure.adapter;

import com.corhuila.Electro_Corhuila.domain.model.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataTarifaRepository extends JpaRepository<Tarifa, Long> {
    Optional<Tarifa> findByEstrato(Integer estrato);
}
