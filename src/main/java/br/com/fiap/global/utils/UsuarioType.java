package br.com.fiap.global.utils;

import lombok.Getter;

@Getter
public enum UsuarioType {
    PACIENTE("Paciente"),
    PROTETOR("Protetor"),
    GUARDIAO("Guardião");

    private final String descricao;

    UsuarioType(String descricao) {
        this.descricao = descricao;
    }
}
