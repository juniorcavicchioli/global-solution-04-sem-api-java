package br.com.fiap.global.controller;

import br.com.fiap.global.model.ContatoEmergencia;
import br.com.fiap.global.service.ContatoEmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contatoemergencia")
public class ContatoEmergenciaController extends BaseController<ContatoEmergencia, Long>{


    @Autowired
    public ContatoEmergenciaController(ContatoEmergenciaService service) {
        super(service);
    }
}
