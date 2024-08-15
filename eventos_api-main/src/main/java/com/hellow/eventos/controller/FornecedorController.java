package com.hellow.eventos.controller;

import com.hellow.eventos.classes.fornecedor.Fornecedor;
        import com.hellow.eventos.classes.fornecedor.FornecedorRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @GetMapping(name="/todos")
    public List<Fornecedor> getTodosFornecedor(){
        return fornecedorRepository.findAll();
    }

    @PostMapping(name="/add")
    public Fornecedor addFornecedor(@RequestBody Fornecedor fornecedor){
        fornecedorRepository.save(fornecedor);
        return fornecedor;
    }

}
