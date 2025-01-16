package com.marvic.pruebarelations.service.padre;

import com.marvic.pruebarelations.padre.model.Padre;
import com.marvic.pruebarelations.repository.PadreRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PadreServiceImp implements IPadreService {

    private final PadreRepository padreRepository;

    PadreServiceImp(PadreRepository padreRepository) {
        this.padreRepository = padreRepository;
    }

    @Override
    public List<Padre> findAll() {
        return padreRepository.findAll();
    }

    @Override
    @Transactional
    public Padre create(Padre padre) {
        return padreRepository.save(padre);
    }
}
