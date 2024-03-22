package com.doces.vini.marcy.loja.doce;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "Doce") //Tabela que o nome e Doce
@Entity(name = "doces") //Entidade chamada doces
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id") //Exceto o campo Id
public class Doce {

    public Doce(DadosCadastroDoces dados) {
        this.nome = dados.nome();
        this.tipo = dados.tipo();
        this.descricao = dados.descricao();
        this.quantidade = dados.quantidade();
        this.fabricacao = dados.fabricacao();
        this.validade = dados.validade();
    }


    @Id //Id chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //O banco de dados vai gerar o id automaticamente autoincrimetando
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING) //tipo de atributo enum que precisa ser mapeado
    private Tipo tipo; //Enum criado
    private String descricao;
    private int quantidade;
    private LocalDate fabricacao;
    private LocalDate validade;


    public void atualizarInformacoes(DadosAtualizarDoces dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.tipo() != null) {
            this.tipo = dados.tipo();
        }
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.quantidade() != 0) {
            this.quantidade = dados.quantidade();
        }

    }
}
