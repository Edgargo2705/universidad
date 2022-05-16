package com.example.Tarea1.Service;

import org.springframework.stereotype.Service;

@Service("juan")
public class ServiceHolaJuan implements ServiceName {
    @Override
    public String name() {
        return "Hola soy Juan";
    }

    }


