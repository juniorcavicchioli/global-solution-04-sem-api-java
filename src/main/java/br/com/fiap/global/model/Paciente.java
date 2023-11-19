package br.com.fiap.global.model;

import jakarta.persistence.*;

import java.util.List;

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

    private String idade;
    private String sexoBiologico;
    private String genero;
    private String colesterol;
    private String triglicerol;
    private String diabete;
    private String historicoFamiliar;
    private String fumante;
    private String obeso;
    private String consumoAlcool;
    private String dieta;
    private String usoMedicamentos;
}
