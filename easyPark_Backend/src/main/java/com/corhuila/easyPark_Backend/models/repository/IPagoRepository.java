package com.corhuila.easyPark_Backend.models.repository;

import com.corhuila.easyPark_Backend.models.entity.Pago;
import org.springframework.data.repository.CrudRepository;

public interface IPagoRepository extends CrudRepository <Pago, Long> {
}
