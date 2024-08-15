package com.hellow.eventos.classes.tipo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.SQLOutput;

@Entity(name="tipo")
@Table(name="tipo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private  String descricao;






}
