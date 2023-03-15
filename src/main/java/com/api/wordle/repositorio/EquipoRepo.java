package com.api.wordle.repositorio;

import com.api.wordle.modelo.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipoRepo extends JpaRepository<Equipo, Integer> {
    List<Equipo> findByNombreEqualsIgnoreCase(String Nombre);
}