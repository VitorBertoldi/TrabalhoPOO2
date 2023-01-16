package crud.model;

import crud.controller.PessoaController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class Pessoa {

    private Scanner scanner = new Scanner(System.in);
    private PessoaController controller;

    public void cadastrar() {
        Pessoa pessoa = new Pessoa();

        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();
        pessoa.setNome(nome);

        System.out.println("Informe a data de nascimento(dd/mm/aa");
        String dataNascimento = scanner.nextLine();
        pessoa.setDataNascimento(LocalDate.parse(dataNascimento,
                DateTimeFormatter.ofPattern("dd/mm/aa")));

        System.out.println("Informe o CPF: ");
        String cpf = scanner.nextLine();
        pessoa.setCpf(cpf);

        controller.cadastrar(pessoa);
    }


    public void listar(UUID id) {
        Pessoa pessoa = controller.ler(id);
        exibirPessoa(pessoa);
    }

    public void delete() {
        Pessoa pessoa = controller.ler(id);
        exibirPessoa(pessoa);

        System.out.println("Informe o novo nome: ");
        String nome = scanner.nextLine();
        pessoa.setNome(nome);

        System.out.println("Informe a data de nascimento(dd/mm/aa");
        String dataNascimento = scanner.nextLine();
        pessoa.setDataNascimento(LocalDate.parse(dataNascimento,
                DateTimeFormatter.ofPattern("dd/mm/aa")));

        System.out.println("Informe o CPF: ");
        String cpf = scanner.nextLine();
        pessoa.setCpf(cpf);
    }

    public void apagar() {
        listar();
        System.out.println("Informe o numero do cliente que deseja apagar");
        Integer numeroCliente = scanner.nextInt();
    }

    public void apagar(UUID id) {
        Pessoa pessoa = controller.delete(id);
        exibirPessoa(pessoa);

    }

    public void listar() {
        List<Pessoa> pessoas = controller.listar();
        for (int index = 0; index < pessoas.size(); index++) {
            System.out.print((index + 1) + );
        }

    }

    public void atualizar() {
        listar();
        System.out.println("Informe o numero do cliente que deseja atualizar");
        Integer numeroCliente = scanner.nextInt();
        Pessoa pessoa =

    }

    public void exibirPessoa(Pessoa pessoa){
        System.out.println("Pessoa - nome: "+ pessoa.getNome()
                + ", nascida em "+ pessoa.getDataNascimento()
                + ", registrada com cpf: "+ pessoa.getCpf());
    }

    public void exibirOpcoes() {
        System.out.println("Informe a opcao desejada: ");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Listar ");
        System.out.println("3 - Atualizar ");
        System.out.println("4 - Apagar");
        System.out.println("0 - Sair");
        Integer opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 2:
                listar();
                break;
            case 3:
                atualizar();
                break;
            case 4:
                apagar();
                break;
            case 5:
                break;
            default:
                System.out.println("Opcao inválida");
        }



    }


    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
