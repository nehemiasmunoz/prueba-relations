package com.marvic.pruebarelations.hijo.model.dto;

import com.marvic.pruebarelations.hijo.model.Hijo;

public record HijoDTO(
//        Long id,
        String nombre
) {
    //Constructor custom
    public HijoDTO(Hijo hijo) {
        this(
//                hijo.getId(),
                hijo.getNombre());
    }
}
