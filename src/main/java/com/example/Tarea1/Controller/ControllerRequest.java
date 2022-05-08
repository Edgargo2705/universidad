package com.example.Tarea1.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class ControllerRequest {

    @GetMapping("crear")
    public String get() {
        return "Hola soy un GET";
    }

    @PostMapping ("crear")
    public String post() {
        return "Hola soy un POST";
    }

    @PutMapping("crear")
    public String put() {
        return "Hola soy un PUT";
    }

    @DeleteMapping ("crear")
    public String delete() {
        return "Hola soy un DELETE";
    }

    /*@RequestMapping(value="/hello", method= RequestMethod.GET)
    public String get() {
        return "Hola soy Get";
    }*/
}
