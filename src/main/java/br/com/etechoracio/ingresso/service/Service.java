package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.mapper.Mapper;
import br.com.etechoracio.ingresso.repository.SalaRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private final SalaRepository salaRepository;
    private final Mapper mapper;

    public Service(SalaRepository salaRepository, Mapper mapper) {
        this.salaRepository = salaRepository;
        this.mapper = mapper;
    }

    public List<SalaResponseDTO> listarAtivas() {
        return mapper.toDTO(salaRepository.findByDtExclusaoIsNull());
    }

}