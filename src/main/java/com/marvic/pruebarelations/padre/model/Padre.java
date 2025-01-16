package com.marvic.pruebarelations.padre.model;

import com.marvic.pruebarelations.hijo.model.Hijo;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Padre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCompleto;
    @OneToMany
    private List<Hijo> hijos;

    public Padre() {}

    public Long getId() {
        return id;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public List<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(List<Hijo> hijos) {
        this.hijos = hijos;
    }
}
