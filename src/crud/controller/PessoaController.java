package crud.controller;

import crud.model.Pessoa;

import java.util.UUID;

public interface PessoaController {

    void cadastrar(Pessoa pessoa);

    Pessoa ler(UUID id);
     void update(UUID id, Pessoa pessoa);

     Pessoa delete(UUID id);
}
