package com.hellow.eventos.classes.fornecedor;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name="fornecedor")
@Entity(name="fornecedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private Integer cnpj;
    private String ativo;
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco_id;
    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo_id;

}