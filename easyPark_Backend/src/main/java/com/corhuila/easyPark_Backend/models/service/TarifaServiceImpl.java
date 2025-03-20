package com.corhuila.easyPark_Backend.models.service;

import com.corhuila.easyPark_Backend.models.repository.ITarifaRepository;
import com.corhuila.easyPark_Backend.models.entity.Tarifa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TarifaServiceImpl implements ITarifaService{

    @Autowired
    private ITarifaRepository tarifaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Tarifa> findAll(){
        return (List<Tarifa>) tarifaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Tarifa findById(Long id){
        return tarifaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Tarifa save(Tarifa tarifa){
        return tarifaRepository.save(tarifa);
    }

    @Override
    @Transactional
    public void delete(Long id){
        tarifaRepository.deleteById(id);
    }
}
