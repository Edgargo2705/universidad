package com.example.Tarea1.Service;

import org.springframework.stereotype.Service;

@Service("rodolfo")
public class ServiceHolaRodolfo implements ServiceName {

    @Override
    public String name(){return "Hola soy Rodolfo";}
}
