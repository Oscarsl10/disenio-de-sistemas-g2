package com.corhuila.easyPark_Backend.models.repository;

import com.corhuila.easyPark_Backend.models.entity.Tarifa;
import org.springframework.data.repository.CrudRepository;

public interface ITarifaRepository extends CrudRepository <Tarifa, Long> {
}
