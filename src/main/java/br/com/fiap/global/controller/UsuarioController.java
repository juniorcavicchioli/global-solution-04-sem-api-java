package br.com.fiap.global.controller;

import br.com.fiap.global.model.Usuario;
import br.com.fiap.global.service.BaseService;
import br.com.fiap.global.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends BaseController<Usuario, Long>{


    @Autowired
    public UsuarioController(UsuarioService service) {
        super(service);
    }
}
