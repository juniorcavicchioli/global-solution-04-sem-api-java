package br.com.fiap.global.model;

import jakarta.persistence.*;

@Entity
@Table(name = "dados_iot")
public class DadosIoT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_usuario", nullable = false)
    private Paciente paciente;

    @Column(nullable = false)
    private String batimentosPorMinuto;
    @Column(nullable = false)
    private String agitacao;
}
