package com.hellow.eventos.classes.midia;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity(name="midia")
@Table(name="midia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private Integer id;
    private String formato;
    private Integer duracao;
    private Integer tamanho;
    private String link;
    private Integer evento_id;
    private Integer tipo_id;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;

}