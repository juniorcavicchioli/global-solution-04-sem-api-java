package br.com.fiap.global.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contato_emergencia")
public class ContatoEmergencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_usuario", nullable = false)
    private Paciente paciente;
}
