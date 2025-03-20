package com.corhuila.easyPark_Backend.models.repository;

import com.corhuila.easyPark_Backend.models.entity.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface IReservaRepository extends CrudRepository<Reserva, Long> {
}
