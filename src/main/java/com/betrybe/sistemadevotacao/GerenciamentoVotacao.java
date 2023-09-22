package com.betrybe.sistemadevotacao;

import java.util.ArrayList;


public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();
 
  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    boolean existe = true;
    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (numero == candidato.getNumero()) {
        System.out.println("Número da pessoa candidata já utilizado!");
        existe = false;
      }
    }
    if (existe) {
      PessoaCandidata candidato = new PessoaCandidata(nome, numero);
      this.pessoasCandidatas.add(candidato);
    }
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    boolean existe = true;
    for (PessoaEleitora eleitor : pessoasEleitoras) {
      if (cpf == eleitor.getCpf()) {
        System.out.println("Pessoa eleitora já cadastrada!");
        existe = false;
      }
    }
    if (existe) {
      PessoaEleitora eleitor = new PessoaEleitora(nome, cpf);
      this.pessoasEleitoras.add(eleitor);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (this.cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      for (PessoaCandidata candidato : pessoasCandidatas) {
        if (candidato.getNumero() == numeroPessoaCandidata) {
          candidato.receberVoto();
          this.cpfsComputados.add(cpfPessoaEleitora);
        }
      }
    }
  }

  @Override
  public void mostrarResultado() {
    if (this.cpfsComputados.size() == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (PessoaCandidata candidato : pessoasCandidatas) {
        String canNm = candidato.getNome();
        int canVts = candidato.getVotos();
        int totVts = this.cpfsComputados.size();
        int pct = Math.round((canVts / totVts) * 100);
        System.out.println("Nome: " + canNm + " - " + canVts + " votos ( " + pct + "% )");
      }
      System.out.println("Total de votos: " + this.cpfsComputados.size());
    }
  }
}
