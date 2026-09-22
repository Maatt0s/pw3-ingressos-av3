package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Sala;
import br.com.etechoracio.ingresso.mapper.SalaMapper;
import br.com.etechoracio.ingresso.repository.SalaRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class SalaService {

    private final SalaRepository SalaRepository;
    private final SalaMapper salaMapper;

    public SalaService(SalaRepository SalaRepository, SalaMapper salaMapper) {
        this.SalaRepository = SalaRepository;
        this.salaMapper = salaMapper;
    }

    public List<SalaResponseDTO> listarAtivas(Long id) {
        return salaMapper.toDTO(SalaRepository.findBydataExclusaoIsNull());
    }

}