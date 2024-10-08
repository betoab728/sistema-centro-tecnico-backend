package com.zelectec.gestioncentros.repository;

import com.zelectec.gestioncentros.model.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador, Long> {
    //listar por estado
    List<Trabajador> findByEstado(String estado);
}
