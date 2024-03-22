package com.doces.vini.marcy.loja.doce;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;


//DTO
public record DadosCadastroDoces(

        @NotBlank //Ele barra e nao pode deixar nem branco nem nulo
        String nome,
        @Enumerated
        Tipo tipo, //Enum criado
        @NotBlank
        String descricao,
        int quantidade,

        LocalDate fabricacao,
        @Future //Ele nao deixa salvar algo q esta fora do tempo de hoje, entao nao pode ser salvo algo depois do dia postado
        LocalDate validade
        ) {
}

/*
{
        "nome": "Brownie",
        "tipo": "Doce",
        "descricao": "Com castanhas recheio de brigadeiro",
        "quantidade": 12,
        "fabricacao": "2024-03-13",
        "validade": "2024-03-23"

}
*/
