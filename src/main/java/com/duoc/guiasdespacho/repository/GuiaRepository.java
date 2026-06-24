package com.duoc.guiasdespacho.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.guiasdespacho.model.Guia;

@Repository
public interface GuiaRepository extends JpaRepository<Guia, Long>{
    List<Guia> findByTransportista_IdAndFecha(Long transportistaId, LocalDate fecha);

    List<Guia> findByTransportista_Id(Long transportistaId);

    List<Guia> findByFecha(LocalDate fecha);


}
