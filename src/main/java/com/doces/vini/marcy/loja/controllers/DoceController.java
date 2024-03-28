package com.doces.vini.marcy.loja.controllers;

import com.doces.vini.marcy.loja.doce.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/doces")
public class DoceController {

    @Autowired //Para usar os instanciados em todos os metodos
    private DoceRepository repository; //Instanciado

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroDoces dados){

        repository.save(new Doce(dados)); //Criado um construtor na classe Doce

    }

    @GetMapping
    public List<DadosListagemDoces> listar (){
        return repository.findAll().stream().map(DadosListagemDoces::new).toList(); //Nos retorna as informacoes listadas no DTO
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarDoces dados){
        var doce = repository.getReferenceById(dados.id());
        doce.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

}
