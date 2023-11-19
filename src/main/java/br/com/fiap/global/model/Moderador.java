package br.com.fiap.global.model;

import jakarta.persistence.*;

@Entity
@Table(name = "moderador")
public class Moderador {
    @Id
    @OneToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_instituicao", referencedColumnName = "id", nullable = false)
    private Instituicao instituicao;
}
