package br.com.cash.commons.models;

import lombok.Data;

public @Data class Conta implements IModel{

    private Integer id;
    private Usuario usuario;
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }
}
