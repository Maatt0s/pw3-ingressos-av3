package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SalaRepository extends JpaRepository<Sala, Long> {

    Optional<Sala> findBydataExclusaoIsNull(Long id);

}