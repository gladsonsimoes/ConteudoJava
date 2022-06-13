package com.company.orientacao_a_objetos.topicos_avancados._6_3_desafio_java_lang_math;

import java.util.Scanner;

public class Principal_JeitoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite a quantidade de jogo a ser feito: ");
        int sequenciaDeJogo = scanner.nextInt();
        for (int i = 1; i <= sequenciaDeJogo; i++) {
            double numeroAleatorio1, numeroAleatorio2, numeroAleatorio3, numeroAleatorio4, numeroAleatorio5, numeroAleatorio6;
            //numeros da cartela do bolao!
            numeroAleatorio1 = Math.random() * 60;
            numeroAleatorio2 = Math.random() * 60;
            numeroAleatorio3 = Math.random() * 60;
            numeroAleatorio4 = Math.random() * 60;
            numeroAleatorio5 = Math.random() * 60;
            numeroAleatorio6 = Math.random() * 60;
            //imprimir numero de cada jogador e numeros aleatorios!
            System.out.println("jogador " + (i) +
                    ": " + Math.round(numeroAleatorio1) + " , "
                    + Math.round(numeroAleatorio2) + " , "
                    + Math.round(numeroAleatorio3) + " , "
                    + Math.round(numeroAleatorio4) + " , "
                    + Math.round(numeroAleatorio5) + " , "
                    + Math.round(numeroAleatorio6));

            // Math.random() * 60  colocado em " Math.round() " resulta em bugs!! , ele coloca mesmo numero em um jogador!!
        }
    }
}
