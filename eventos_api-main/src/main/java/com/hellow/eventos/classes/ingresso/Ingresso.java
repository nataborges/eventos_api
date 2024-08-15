package com.hellow.eventos.classes.ingresso;

import com.hellow.eventos.classes.ingresso.Ingresso;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity(name="ingresso")
@Table(name="ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id_ingresso;
    private float valor_base;
    private boolean meia;
    private boolean social;
    private float valor_pagp;
    private boolean pago;
    private boolean vip;
    private Integer evento_id;
    private Integer tipo_id;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;

}