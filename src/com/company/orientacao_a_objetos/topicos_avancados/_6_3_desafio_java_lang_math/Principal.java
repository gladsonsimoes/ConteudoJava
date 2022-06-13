package com.company.orientacao_a_objetos.topicos_avancados._6_3_desafio_java_lang_math;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de jogadas: ");
        int informarJogadas = scanner.nextInt();

        for (int j = 1; j <= informarJogadas; j++){
            System.out.println("Jogador " + j + ": ");
            MegaSena megasena = new MegaSena();
            megasena.sortear();
        }
    }
}