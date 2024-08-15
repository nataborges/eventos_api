package com.hellow.eventos.controller;

import com.hellow.eventos.classes.ingresso.Ingresso;
import com.hellow.eventos.classes.ingresso.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingresso")
public class IngressoController {

    @Autowired
    private IngressoRepository ingressoRepository;

    @GetMapping(name="/todos")
    public List<Ingresso> getTodosIngresso(){
        return ingressoRepository.findAll();
    }

    @PostMapping(name="/add")
    public Ingresso addIngresso(@RequestBody Ingresso ingresso){
        ingressoRepository.save(ingresso);
        return ingresso;
    }

}
