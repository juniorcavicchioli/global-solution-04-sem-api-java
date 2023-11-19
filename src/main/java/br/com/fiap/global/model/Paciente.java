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
@Table(name = "paciente")
public class Paciente {
    @Id
    @OneToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "paciente")
    private List<ContatoEmergencia> contatosEmergencia;

    @ManyToMany
    @JoinTable(
            name = "paciente_monitor",
            joinColumns = @JoinColumn(name = "id_paciente"),
            inverseJoinColumns = @JoinColumn(name = "id_monitor")
    )
    private List<Monitor> monitores;

    @OneToMany(mappedBy = "paciente")
    private List<DadosIoT> dadosIoTList;

    @Column(nullable = false)
    private String idade;
    @Column(nullable = false)
    private String sexoBiologico;
    @Column(nullable = false)
    private String genero;
    @Column(nullable = false)
    private String colesterol;
    @Column(nullable = false)
    private String triglicerol;
    @Column(nullable = false)
    private String diabete;
    @Column(nullable = false)
    private String historicoFamiliar;
    @Column(nullable = false)
    private String fumante;
    @Column(nullable = false)
    private String obeso;
    @Column(nullable = false)
    private String consumoAlcool;
    @Column(nullable = false)
    private String dieta;
    @Column(nullable = false)
    private String usoMedicamentos;
}
