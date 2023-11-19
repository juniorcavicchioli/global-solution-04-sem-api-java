package br.com.fiap.global.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private String nome;
    @Column(nullable = false)
    @Max(value = 150)
    private String idade;
    @Column(nullable = false)
    @Pattern(regexp = "^(masculino|feminino)$", message = "O sexo biológico deve ser 'masculino' ou 'feminino'")
    private String sexoBiologico;
    @Column(nullable = false)
    @NotBlank
    @Size(max = 20)
    private String genero;
    @Column(nullable = false)
    @NotBlank @Size(max = 20)
    private String colesterol;
    @Column(nullable = false)
    @NotBlank @Size(max = 20)
    private String triglicerol;
    @Column(nullable = false)
    @NotBlank @Size(max = 20)
    private String diabete;
    @Column(nullable = false)
    private String historicoFamiliar;
    @Column(nullable = false)
    private boolean fumante = false;
    @Column(nullable = false)
    private boolean obeso = false;
    @Column(nullable = false)
    private boolean consumoAlcool = false;
    @Column(nullable = false)
    private String dieta;
    @Column(nullable = false)
    private String usoMedicamentos;
}
