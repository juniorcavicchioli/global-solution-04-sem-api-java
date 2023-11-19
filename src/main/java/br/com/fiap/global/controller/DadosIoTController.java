package br.com.fiap.global.controller;

import br.com.fiap.global.model.DadosIoT;
import br.com.fiap.global.service.DadosIoTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dadosiot")
public class DadosIoTController extends BaseController<DadosIoT, Long>{


    @Autowired
    public DadosIoTController(DadosIoTService service) {
        super(service);
    }
}
