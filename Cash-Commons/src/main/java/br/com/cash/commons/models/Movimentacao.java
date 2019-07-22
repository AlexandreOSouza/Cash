package br.com.cash.commons.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

public @Data class Movimentacao implements IModel {

    private Integer id;
    private Usuario usuariuo;
    private Conta conta;
    private TipoMovimentacao tipoMovimentacao;
    private String descricao;
    private Calendar dataMovimentacao;
    private BigDecimal valorMovimentacao;

    @Override
    public Integer getId() {
        return null;
    }
}
