package com.corhuila.Electro_Corhuila.infrastructure.entrypoints;

import com.corhuila.Electro_Corhuila.domain.model.Tarifa;
import com.corhuila.Electro_Corhuila.domain.ports.out.ITarifaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarifas")
public class TarifaController {

    private final ITarifaRepository tarifaRepository;

    public TarifaController(ITarifaRepository tarifaRepository) {
        this.tarifaRepository = tarifaRepository;
    }

    @PostMapping
    public ResponseEntity<Tarifa> save(@RequestBody Tarifa tarifa) {
        return ResponseEntity.ok(tarifaRepository.save(tarifa));
    }

    @GetMapping("/estrato/{estrato}")
    public ResponseEntity<Tarifa> findByEstrato(@PathVariable Integer estrato) {
        return tarifaRepository.findByEstrato(estrato)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Tarifa>> findAll() {
        return ResponseEntity.ok(tarifaRepository.findAll());
    }
}
