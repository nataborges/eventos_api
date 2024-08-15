package com.hellow.eventos.controller;

import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.evento.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {
    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping(name="/todos")
    public List<Evento> getTodosEventos(){
        return eventoRepository.findAll();
    }

    @PostMapping(name="/add")
    public Evento addEvento(@RequestBody Evento evento){
        eventoRepository.save(evento);
        return evento;
    }

}
