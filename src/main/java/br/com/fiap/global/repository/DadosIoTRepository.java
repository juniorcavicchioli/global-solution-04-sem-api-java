package br.com.fiap.global.repository;

import br.com.fiap.global.model.DadosIoT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosIoTRepository extends JpaRepository<DadosIoT, Long> {

}
