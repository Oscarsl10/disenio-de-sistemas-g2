package com.corhuila.Electro_Corhuila.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int estrato;

    @ManyToOne
    @JoinColumn(name = "tarifa_id")
    private Tarifa tarifa;

    public User(){}

    public User(Long id, String name, Tarifa tarifa){
        this.id = id;
        this.name = name;
        this.tarifa = tarifa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
}
