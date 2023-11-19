package br.com.fiap.global.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "instituicao")
public class Instituicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "instituicao")
    private List<Monitor> monitores;

    @OneToMany(mappedBy = "instituicao")
    private List<Moderador> moderadores;

    private String telefone;
    private String endereco;

    private String moderador;
//    private String cpnj;
//    private String razaoSocial;
}
