package com.api.wordle.repositorio;

import com.api.wordle.modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JugadorRepo extends JpaRepository<Jugador, Integer> {
    List<Jugador> findByNombreEqualsIgnoreCase(String Nombre);
}