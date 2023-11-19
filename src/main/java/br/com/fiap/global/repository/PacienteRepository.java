package br.com.fiap.global.repository;

import br.com.fiap.global.model.Paciente;
import br.com.fiap.global.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
