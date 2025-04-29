package com.corhuila.Electro_Corhuila.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tarifa")
public class Tarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer estrato;
    private Double precio;

    public Tarifa(){}

    public Tarifa(Long id, Integer estrato, Double precio){
        this.id = id;
        this.estrato = estrato;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
