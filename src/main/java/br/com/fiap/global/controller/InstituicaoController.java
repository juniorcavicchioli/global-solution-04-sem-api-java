package br.com.fiap.global.controller;

import br.com.fiap.global.model.Instituicao;
import br.com.fiap.global.service.InstituicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instituicao")
public class InstituicaoController extends BaseController<Instituicao, Long>{


    @Autowired
    public InstituicaoController(InstituicaoService service) {
        super(service);
    }
}
