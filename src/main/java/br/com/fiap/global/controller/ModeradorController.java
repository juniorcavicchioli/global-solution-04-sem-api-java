package br.com.fiap.global.controller;

import br.com.fiap.global.model.Moderador;
import br.com.fiap.global.service.ModeradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moderador")
public class ModeradorController extends BaseController<Moderador, Long>{


    @Autowired
    public ModeradorController(ModeradorService service) {
        super(service);
    }
}
