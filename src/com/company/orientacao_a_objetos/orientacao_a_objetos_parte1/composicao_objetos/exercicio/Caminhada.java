package com.company.orientacao_a_objetos.orientacao_a_objetos_parte1.composicao_objetos.exercicio;

public class Caminhada {

    public void andar(Pessoa pessoa1) {
        System.out.println("Eu \"" + pessoa1.nome + "\"" + "estou andando com o \"" + pessoa1.cachorro.nome);
    }
}
