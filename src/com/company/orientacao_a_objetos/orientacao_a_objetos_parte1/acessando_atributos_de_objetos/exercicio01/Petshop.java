package com.company.orientacao_a_objetos.orientacao_a_objetos_parte1.acessando_atributos_de_objetos.exercicio01;


public class Petshop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Bidu";
        cachorro.idade = 2;
        cachorro.raca = "Boxer";
        cachorro.sexo = 'M';

        System.out.println("\n===============================");
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);

        cachorro = new Cachorro();

        cachorro.nome = "Kadu";
        cachorro.idade = 4;
        cachorro.raca = "Husky-Siberiano";
        cachorro.sexo = 'M';

        System.out.println("\n==============================");
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);

    }
}
