package br.com.fiap.global.model;

import jakarta.persistence.*;

@Entity
@Table(name = "dados_iot")
public class DadosIoT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_usuario")
    private Paciente paciente;

    private String batimentosPorMinuto;
    private String agitacao;
}
