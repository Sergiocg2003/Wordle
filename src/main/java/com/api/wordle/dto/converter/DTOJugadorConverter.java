package com.api.wordle.dto.converter;

import com.api.wordle.dto.DTOJugador;
import com.api.wordle.modelo.Jugador;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DTOJugadorConverter {
    private final ModelMapper modelMapper;
    public DTOJugador convertToDTO(Jugador jugador){
        return modelMapper.map(jugador,DTOJugador.class);
    }
}
