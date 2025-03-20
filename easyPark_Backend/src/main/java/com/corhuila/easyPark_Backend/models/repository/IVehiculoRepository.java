package com.corhuila.easyPark_Backend.models.repository;

import com.corhuila.easyPark_Backend.models.entity.Vehiculo;
import org.springframework.data.repository.CrudRepository;

public interface IVehiculoRepository extends CrudRepository <Vehiculo, Long> {
}
