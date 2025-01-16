package com.marvic.pruebarelations.service.hijo;

import com.marvic.pruebarelations.hijo.model.Hijo;

import java.util.List;

public interface IHijoService {
    List<Hijo> findAll();
    Hijo create(Hijo hijo);
}
