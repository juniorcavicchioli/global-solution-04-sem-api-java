package br.com.fiap.global.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
    @Column(nullable = false)
    private List<Paciente> pacientes;
}
