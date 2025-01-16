package com.marvic.pruebarelations.repository;

import com.marvic.pruebarelations.padre.model.Padre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PadreRepository extends JpaRepository<Padre, Long> {
}
