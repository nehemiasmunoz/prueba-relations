package com.marvic.pruebarelations.service.hijo;

import com.marvic.pruebarelations.hijo.model.Hijo;
import com.marvic.pruebarelations.repository.HijoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HijoServiceImp implements IHijoService{

    private final HijoRepository hijoRepository;

    HijoServiceImp(HijoRepository hijoRepository) {
        this.hijoRepository = hijoRepository;
    }

    @Override
    public List<Hijo> findAll() {
        return hijoRepository.findAll();
    }

    @Override
    @Transactional
    public Hijo create(Hijo hijo) {
        return hijoRepository.save(hijo);
    }
}
