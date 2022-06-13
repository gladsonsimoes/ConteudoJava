package com.company.orientacao_a_objetos.orientacao_a_objetos_parte1.composicao_objetos.exercicio;

public class Passeio {
    public static void main(String[] args) {

        Pessoa pessoa1 =  new Pessoa();
        pessoa1.nome = "José";
        pessoa1.cachorro = new Cachorro();

        pessoa1.cachorro.nome = "Bidu";
        pessoa1.cachorro.idade = 3;
        pessoa1.cachorro.raca = "Boxer";
        pessoa1.cachorro.sexo = 'M';

        Caminhada c = new Caminhada();
        c.andar(pessoa1);

    }
}
