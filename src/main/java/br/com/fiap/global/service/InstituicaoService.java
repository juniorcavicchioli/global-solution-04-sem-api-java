package br.com.fiap.global.service;

import br.com.fiap.global.model.Instituicao;
import br.com.fiap.global.repository.InstituicaoRepository;
import org.springframework.stereotype.Service;

@Service
public class InstituicaoService extends BaseService<Instituicao, Long>{
    public InstituicaoService(InstituicaoRepository repository) {
        super(repository);
    }
}
