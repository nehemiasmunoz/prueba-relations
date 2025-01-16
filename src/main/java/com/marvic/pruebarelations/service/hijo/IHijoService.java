package com.marvic.pruebarelations.service.hijo;

import com.marvic.pruebarelations.hijo.model.Hijo;
import com.marvic.pruebarelations.hijo.model.dto.HijoDTO;
import com.marvic.pruebarelations.hijo.model.dto.NewHijoDTO;

import java.util.List;

public interface IHijoService {

    List<HijoDTO> findAll();
    HijoDTO create(NewHijoDTO hijo);
}
