package com.hellow.eventos.controller;

import com.hellow.eventos.classes.midia.MidiaRepository;
import com.hellow.eventos.classes.midia.Midia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/midia")
public class MidiaController {

    @Autowired
    private MidiaRepository midiaRepository;

    @GetMapping(name="/todos")
    public List<Midia> getTodosMidia(){
        return midiaRepository.findAll();
    }

    @PostMapping(name="/add")
    public Midia addMidia(@RequestBody Midia midia){
        midiaRepository.save(midia);
        return midia;
    }

}