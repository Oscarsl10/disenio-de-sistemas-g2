package com.corhuila.Electro_Corhuila.infrastructure.adapter;

import com.corhuila.Electro_Corhuila.domain.model.Tarifa;
import com.corhuila.Electro_Corhuila.domain.ports.out.ITarifaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TarifaRepositoryAdapter implements ITarifaRepository {

    private final SpringDataTarifaRepository springDataTarifaRepository;

    public TarifaRepositoryAdapter(SpringDataTarifaRepository springDataTarifaRepository) {
        this.springDataTarifaRepository = springDataTarifaRepository;
    }

    @Override
    public Tarifa save(Tarifa tarifa) {
        return springDataTarifaRepository.save(tarifa);
    }

    @Override
    public Optional<Tarifa> findByEstrato(Integer estrato) {
        return springDataTarifaRepository.findByEstrato(estrato);
    }

    @Override
    public List<Tarifa> findAll() {
        return springDataTarifaRepository.findAll();
    }
}
