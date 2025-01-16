package com.marvic.pruebarelations.repository;

import com.marvic.pruebarelations.hijo.model.Hijo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HijoRepository extends JpaRepository<Hijo, Long> {
}
