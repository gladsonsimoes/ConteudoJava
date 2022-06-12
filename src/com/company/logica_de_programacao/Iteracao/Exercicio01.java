package com.company.logica_de_programacao.Iteracao;

/*
Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
Encontre os números divisíveis por 3.
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;

        for (i = 0; i < 20; i++)
            if (i % 3 == 0) {
                System.out.print(i);
            } else {
                System.out.println("-");
            }
    }
}
