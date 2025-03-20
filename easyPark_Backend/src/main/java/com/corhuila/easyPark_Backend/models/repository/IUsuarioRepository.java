package com.corhuila.easyPark_Backend.models.repository;

import com.corhuila.easyPark_Backend.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository <Usuario, Long> {
}
