package com.hellow.eventos.controller;

import com.hellow.eventos.classes.usuario.Usuario;
import com.hellow.eventos.classes.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(name="/todos")
    public List<Usuario> getTodosEndereco(){
        return usuarioRepository.findAll();
    }

    @PostMapping(name="/add")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
        return usuario;
    }

}
