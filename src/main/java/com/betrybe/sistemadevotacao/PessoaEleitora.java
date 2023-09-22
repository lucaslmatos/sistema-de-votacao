package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
     * Construtor da classe PessoaCandidata.
     *
     * @param novoNome O nome da pessoa eletiroa.
     * @param novoCpf  O código de pessoa fisica da pessoa eleitora.
     */

  public PessoaEleitora(String novoNome, String novoCpf) {
    this.setNome(novoNome);
    this.setCpf(novoCpf);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String novoCpf) {
    this.cpf = novoCpf;
  }
}
