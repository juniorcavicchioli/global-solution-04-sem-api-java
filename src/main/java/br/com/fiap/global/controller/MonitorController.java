package br.com.fiap.global.controller;

import br.com.fiap.global.model.Monitor;
import br.com.fiap.global.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor")
public class MonitorController extends BaseController<Monitor, Long> {


    @Autowired
    public MonitorController(MonitorService service) {
        super(service);
    }
}
