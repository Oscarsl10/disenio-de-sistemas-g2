package com.corhuila.easyPark_Backend.models.repository;

import com.corhuila.easyPark_Backend.models.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository <Empleado, Long> {
}
