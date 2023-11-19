package br.com.fiap.global.repository;

import br.com.fiap.global.model.ContatoEmergencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoEmergenciaRepository extends JpaRepository<ContatoEmergencia, Long> {

}
