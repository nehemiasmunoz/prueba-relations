package com.marvic.pruebarelations.service.padre;

import com.marvic.pruebarelations.padre.model.Padre;

import java.util.List;

public interface IPadreService {
    List<Padre> findAll();
    Padre create(Padre padre);
}
