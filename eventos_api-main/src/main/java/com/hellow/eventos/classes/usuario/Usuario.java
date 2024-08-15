package com.hellow.eventos.classes.usuario;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
    @Entity(name="usuario")
    @Table(name="usuario")
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private String nome;
        private String sobrenome;
        private String login;
        private String senha;
        private Integer dt_nascimento;
        private Integer dt_criacao;
        private Integer telefone;
        private String email;
        private Integer cpf;
        @ManyToOne
        @JoinColumn(name = "id_tipo")
        private Tipo tipo;

    }
