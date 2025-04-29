package com.corhuila.Electro_Corhuila.domain.ports.in;

import com.corhuila.Electro_Corhuila.domain.model.Tarifa;

import java.util.List;
import java.util.Optional;

public interface TarifaService {

    Tarifa save(Tarifa tarifa);
    Optional<Tarifa> findById(Long id);
    List<Tarifa> findAll();
    void deleteById(Long id);
}
