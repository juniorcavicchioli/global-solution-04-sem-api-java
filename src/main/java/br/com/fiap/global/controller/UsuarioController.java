package br.com.fiap.global.controller;

import br.com.fiap.global.model.Usuario;
import br.com.fiap.global.model.dto.Credencial;
import br.com.fiap.global.model.dto.Token;
import br.com.fiap.global.repository.UsuarioRepository;
import br.com.fiap.global.service.BaseService;
import br.com.fiap.global.service.TokenService;
import br.com.fiap.global.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends BaseController<Usuario, Long>{

    @Autowired
    AuthenticationManager manager;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    UsuarioRepository usuarioRepository;

//    @Autowired
//    PagedResourcesAssembler<Object> assembler;

    @Autowired
    TokenService tokenService;

    @Autowired
    public UsuarioController(UsuarioService service) {
        super(service);
    }

    @PostMapping("/registrar")
    public ResponseEntity<Usuario> signup(@RequestBody @Valid Usuario usuario, BindingResult result){
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        Usuario usuarioBanco = service.create(usuario);
        return new ResponseEntity<Usuario>(usuarioBanco, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Credencial credencial){
//        manager.authenticate(credencial.toAuthentication());
        Optional<Usuario> usuario = usuarioRepository.findByEmail(credencial.email());
        if (usuario.isPresent()){
            if (encoder.matches(credencial.senha(), usuario.get().getPassword())){
                var token = tokenService.generateToken(credencial);
                return ResponseEntity.ok(token);
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais de login incorretas");
    }
}
