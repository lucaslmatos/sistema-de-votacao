package com.betrybe.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  /**
     * Construtor da classe PessoaCandidata.
     *
     * @args Argumentos.
     */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gv = new GerenciamentoVotacao();
    Integer firstOption = 1;
    Integer secondOption = 1;
    Integer thirdOption = 1;

    while (firstOption == 1) {
      
      System.out.println("Cadastrar pessoa candidata?\n1 - Sim \n2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      firstOption = scanner.nextInt();

      if (firstOption == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomeCandidato = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        Integer numeroCandidato = scanner.nextInt();
        gv.cadastrarPessoaCandidata(nomeCandidato, numeroCandidato);
      }
    }

    while (secondOption == 1) {
      
      System.out.println("Cadastrar pessoa eleitora?\n1 - Sim \n2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      secondOption = scanner.nextInt();

      if (secondOption == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nomeEleitor = scanner.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfEleitor = scanner.next();
        gv.cadastrarPessoaEleitora(nomeEleitor, cpfEleitor);
      }
    }

    while (thirdOption != 4) {
      
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar \n2 - Resultado Parcial\n3 - Finalizar Votação");

      thirdOption = scanner.nextInt();

      switch (thirdOption) {
        case 1:
          System.out.println("Entre com o cpf da pessoa eleitora:");
          String cpfEleitor = scanner.next();
          System.out.println("Entre com o número da pessoa candidata:");
          Integer numeroCandidato = scanner.nextInt();
          gv.votar(cpfEleitor, numeroCandidato);
          break;
        case 2:
          gv.mostrarResultado();
          break;
        case 3:
          gv.mostrarResultado();
          thirdOption = 4;
          break;
        default:
          System.out.println("ERROR");
      }
    }
    scanner.close();
  }

}
