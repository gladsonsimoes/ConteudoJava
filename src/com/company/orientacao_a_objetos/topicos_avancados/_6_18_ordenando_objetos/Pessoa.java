package com.company.orientacao_a_objetos.topicos_avancados._6_18_ordenando_objetos;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //equals e hash_code serve para comparar objetos

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return getIdade() == pessoa.getIdade() && Objects.equals(getNome(), pessoa.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade());
    }

    // O método ToString() Talvez este seja o método que é mais claro com relação ao seu propósito.
    // Seu objetivo é trazer uma representação textual de uma instância de um objeto.
    // Essa representação textual de um objeto vem a ser muito útil principalmente em situações de debugging e de logging.
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
    //O compareTo() é para comparação de ordem léxica, no caso usado mais em ordenação alfabética seguindo a tabela ASCII.
    // Ordenando os valores da lista.
    @Override
    public int compareTo(Pessoa pessoa) {
        return nome.compareTo(pessoa.getNome());
    }
}
