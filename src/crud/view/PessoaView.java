package crud.view;

import crud.controller.PessoaController;
import crud.model.Pessoa;

import java.util.Scanner;
import java.util.UUID;

public class PessoaView {

    private Scanner scanner = new Scanner(System.in);

    private PessoaController controller;
     private Scanner scanner = new Scanner(System.in);

     public void listar(UUID id) {
         Pessoa pessoa = controller.ler(id);
         System.out.println("Pessoa - nome: "+ pessoa.getNome()
                 + ", nascida em "+ pessoa.getDataNascimento()
                 + ", registrada com cpf: "+ pessoa.getCpf());
     }

}
