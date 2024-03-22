package com.doces.vini.marcy.loja.doce;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarDoces(
        @NotNull
        Long id,
        String nome,
        Tipo tipo,
        String descricao,
        int quantidade) {
}
