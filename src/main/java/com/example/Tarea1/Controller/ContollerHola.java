package com.example.Tarea1.Controller;

import com.example.Tarea1.Service.ServiceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ContollerHola {

    @Autowired
    @Qualifier("rodolfo")
    private ServiceName service;

    @GetMapping
    public String name () {
        return service.name();
    }


}
