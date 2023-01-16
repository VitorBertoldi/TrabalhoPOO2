package crud.controller.impl;

import crud.controller.PessoaController;
import crud.model.Pessoa;

import java.awt.image.WritableRaster;
import java.util.*;

public class PessoaEmMemoriaController implements PessoaController {

    private Map<UUID, Pessoa> pessoas = new HashMap<>();

    @Override
    public void cadastrar(Pessoa pessoa) {
        pessoa.setId(UUID.randomUUID());
        pessoas.add(pessoa);


    }

    @Override
    public Pessoa ler(UUID id) {
        Pessoa encontrada = null;
        for (Pessoa pessoa: pessoas) {
            if (pessoa.getId().equals(id)) {
                encontrada = pessoa;
            }
        }

        return null;
    }

    @Override
    public void update(UUID id, Pessoa pessoa) {
        for (int index = 0; index < pessoas.size(); index++) {
            Pessoa antiga = pessoas.get(index);
            if (antiga.getId().equals(id)) {
                pessoas.set(index, pessoa);
            }
        }

    }

    @Override
    public Pessoa delete(UUID id) {
        Iterator<Pessoa> iterator = pessoas.iterator();
        while(iterator.hasNext()) {
            Pessoa pessoa = iterator.next();
            if (pessoa.getId().equals(id)) {
                apagada = pessoa;
                iterator.remove();
            }

        }

        return apagada;
    }
}
