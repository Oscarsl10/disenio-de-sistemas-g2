package com.corhuila.Electro_Corhuila.domain.ports.out;

import com.corhuila.Electro_Corhuila.domain.model.Tarifa;

import java.util.List;
import java.util.Optional;


public interface ITarifaRepository {

    Tarifa save(Tarifa tarifa);
    Optional<Tarifa> findByEstrato(Integer estrato);
    List<Tarifa> findAll();
}
