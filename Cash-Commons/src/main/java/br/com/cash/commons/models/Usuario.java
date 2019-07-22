package br.com.cash.commons.models;

import lombok.Data;

public @Data class Usuario implements IModel{

    private Integer id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private String caminhoFoto;

    @Override
    public Integer getId() {
        return id;
    }
}
