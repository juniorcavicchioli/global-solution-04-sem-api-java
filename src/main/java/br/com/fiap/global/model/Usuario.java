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
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "usuario")
public class Usuario implements UserDetails {
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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USUARIO"));
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // não existe campo para isso
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // não existe campo para isso
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // não existe campo para isso
    }

    @Override
    public boolean isEnabled() {
        return true; // não existe campo para isso
    }
}
