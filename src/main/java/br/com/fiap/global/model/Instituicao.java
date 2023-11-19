package br.com.fiap.global.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
@Table(name = "instituicao")
public class Instituicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "instituicao")
    private List<Monitor> monitores;

    @ManyToOne
    @JoinColumn(name = "id_moderador", referencedColumnName = "id_usuario", nullable = false)
    private Moderador moderador;

    @Column(nullable = false)
    @NotBlank @Size(max = 20)
    private String telefone;
    @Column(nullable = false)
    @NotBlank
    private String endereco;
}
