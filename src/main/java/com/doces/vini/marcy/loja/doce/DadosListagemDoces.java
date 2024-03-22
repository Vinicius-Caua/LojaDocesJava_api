package com.doces.vini.marcy.loja.doce;

import java.time.LocalDate;

public record DadosListagemDoces(Long id, String nome, Tipo tipo, String descricao, LocalDate fabricacao, LocalDate validade) {
    public DadosListagemDoces(Doce doce){
        this(doce.getId(), doce.getNome(), doce.getTipo(), doce.getDescricao(), doce.getFabricacao(), doce.getValidade());
    }
}
