package com.corhuila.easyPark_Backend.models.repository;

import com.corhuila.easyPark_Backend.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepository extends CrudRepository <Cliente, Long> {
}
