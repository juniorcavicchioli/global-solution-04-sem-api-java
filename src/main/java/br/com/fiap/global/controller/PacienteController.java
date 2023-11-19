package br.com.fiap.global.controller;

import br.com.fiap.global.model.Paciente;
import br.com.fiap.global.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController extends BaseController<Paciente, Long> {


    @Autowired
    public PacienteController(PacienteService service) {
        super(service);
    }
}
