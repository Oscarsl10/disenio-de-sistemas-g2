package com.corhuila.easyPark_Backend.controllers;

import com.corhuila.easyPark_Backend.models.entity.Usuario;
import com.corhuila.easyPark_Backend.models.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// @CrossOrigin(origins = {"http://localhost:4200"})

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuario")
    public List<Usuario> index(){
        return usuarioService.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Usuario show(@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping("/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping("/usuario/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id){
        Usuario usuarioActual = usuarioService.findById(id);
        usuarioActual.setNombre(usuario.getNombre());
        usuarioActual.setCorreo(usuario.getCorreo());
        usuarioActual.setContrasenia(usuario.getContrasenia());
        return usuarioService.save(usuarioActual);
    }

    @DeleteMapping("/usuario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
