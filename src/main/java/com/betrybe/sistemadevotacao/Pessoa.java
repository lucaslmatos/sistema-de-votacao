package com.betrybe.sistemadevotacao;

public abstract class Pessoa {

  protected String nome;
  
  public String getNome() {
    return nome;
  }

  public void setNome(String newName) {
    this.nome = newName;
  }
}
