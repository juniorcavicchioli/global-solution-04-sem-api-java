package br.com.fiap.global.repository;

import br.com.fiap.global.model.Moderador;
import br.com.fiap.global.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeradorRepository extends JpaRepository<Moderador, Long> {

}
