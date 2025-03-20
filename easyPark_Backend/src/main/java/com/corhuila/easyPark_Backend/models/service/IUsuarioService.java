package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.entity.Usuario;
import java.util.List;

public interface IUsuarioService {

    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario save(Usuario usuario);

    public void delete(Long id);
}
