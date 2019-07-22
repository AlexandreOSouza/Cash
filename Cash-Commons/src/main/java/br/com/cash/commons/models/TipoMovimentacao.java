package br.com.cash.commons.models;

import lombok.Data;

public @Data class TipoMovimentacao implements IModel {

    private Integer id;
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }
}
