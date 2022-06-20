package com.company.orientacao_a_objetos.topicos_avancados._6_11_collections_framework;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("José");
        Aluno a4 = new Aluno("Pedro");


        //aqui ele vai definir uma lista chamada "alunos", usando a Classe "Aluno"
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(a1); //aqui ele instancia a lista "alunos" , e adiciona o objeto "a1"
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a4); //pode ser colocado repetido

        imprimirAlunos(alunos); //metodo para imprimir alunos
    }
    private static void imprimirAlunos(List<Aluno> alunos){
        //laço de repeticao para selecionar automaticamente os objetos 
        for (Aluno a : alunos ){
            System.out.println("Nome: " + a.getNome());
            }
        }
}

