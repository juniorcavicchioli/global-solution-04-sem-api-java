package br.com.fiap.global.model;

import br.com.fiap.global.utils.UsuarioType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull
    private String nome;
    @Column(nullable = false)
    @NotNull @Email(message = "infomre um e-mail válido") @Size(max = 60)
    private String email;
    @Column(nullable = false)
    @NotBlank
    private String senha;
    @Column(nullable = false)
    @NotBlank @Size(max = 20)
    private String telefone;

    @Column(nullable = false)
    private String tipoUsuario;
}
