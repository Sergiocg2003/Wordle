package com.api.wordle.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DTOJugador {
    private Integer idJugador;
    private Integer Equipo_idEquipo;
    private String Nombre;
    private String Imagen;
    private String Pin;
    private Integer Puntos;
}
