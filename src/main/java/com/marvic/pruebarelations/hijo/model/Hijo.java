package com.marvic.pruebarelations.hijo.model;

import com.marvic.pruebarelations.hijo.model.dto.NewHijoDTO;
import com.marvic.pruebarelations.padre.model.Padre;
import jakarta.persistence.*;

@Entity
public class Hijo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

//    @ManyToOne
//    @JoinColumn(name = "padre_id")
//    private Padre padre;

    public Hijo() {}

    public Hijo(NewHijoDTO dto) {
        this.nombre = dto.nombre();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
