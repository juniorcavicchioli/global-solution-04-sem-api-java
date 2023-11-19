package br.com.fiap.global.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "monitor")
public class Monitor {

    @Id
    @OneToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_instituicao", referencedColumnName = "id", nullable = true)
    private Instituicao instituicao;

    @ManyToMany(mappedBy = "monitores")
    private List<Paciente> pacientes;
}
