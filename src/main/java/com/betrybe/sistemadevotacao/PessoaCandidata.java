package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
     * Construtor da classe PessoaCandidata.
     *
     * @param novoNome O nome da pessoa candidata.
     * @param numero  O número identificador da pessoa candidata.
     */

  public PessoaCandidata(String novoNome, int numero) {
    this.setNome(novoNome);
    this.numero = numero;
    this.votos = 0;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
