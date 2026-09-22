package br.com.etechoracio.ingresso.mapper;

import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Sala;

import java.util.List;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {

    List<SalaResponseDTO> toDTO(List<Sala> salas);

}