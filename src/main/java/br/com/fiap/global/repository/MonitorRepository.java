package br.com.fiap.global.repository;

import br.com.fiap.global.model.Monitor;
import br.com.fiap.global.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor, Long> {

}
