package br.com.fiap.global.config;

public record RestError (
        int cod,
        String message
) {}
