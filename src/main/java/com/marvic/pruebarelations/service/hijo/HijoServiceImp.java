package com.marvic.pruebarelations.service.hijo;

import com.marvic.pruebarelations.hijo.model.Hijo;
import com.marvic.pruebarelations.hijo.model.dto.HijoDTO;
import com.marvic.pruebarelations.hijo.model.dto.NewHijoDTO;
import com.marvic.pruebarelations.repository.HijoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HijoServiceImp implements IHijoService{

    private final HijoRepository hijoRepository;

    HijoServiceImp(HijoRepository hijoRepository) {
        this.hijoRepository = hijoRepository;
    }

    @Override
    public List<HijoDTO> findAll() {
        return   hijoRepository.findAll().stream()
                .map(hijo -> new HijoDTO(hijo))
                .collect(Collectors.toList());
    }



    @Override
    @Transactional
    public HijoDTO create(NewHijoDTO hijo) {
        return new HijoDTO( hijoRepository.save(new Hijo(hijo)));
    }
}
