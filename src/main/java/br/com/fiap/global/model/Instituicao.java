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
    private String telefone;
    @Column(nullable = false)
    private String endereco;
}
