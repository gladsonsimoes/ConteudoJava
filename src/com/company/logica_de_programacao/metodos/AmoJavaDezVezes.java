package com.company.logica_de_programacao.metodos;

//eu amo java 10 vezes

import java.util.Scanner;

public class AmoJavaDezVezes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        dezvezesjava(0 );

    }

    static void dezvezesjava(Integer vezesjava) {

        if (++vezesjava <= 10) {
            System.out.println((vezesjava) + " Eu amo Java");
            dezvezesjava(vezesjava);
        }

    }

}
