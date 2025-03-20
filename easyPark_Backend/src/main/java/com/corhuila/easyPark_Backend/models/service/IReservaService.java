package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.entity.Reserva;
import java.util.List;

public interface IReservaService {

    public List<Reserva> findAll();

    public Reserva findById(Long id);

    public Reserva save(Reserva reserva);

    public void delete(Long id);
}
