package com.company.logica_de_programacao.vetores;

/*
Repare nos vetores abaixo:
Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

Os quatro primeiros vetores estão guardando o faturamento diário de cada semana e o último
vetor, que é de 2 dimensões,
guarda o faturamento mensal separado por semanas.


Crie um algoritmo que encontre qual a semana teve o maior faturamento.

No final mostre qual foi essa semana e de quanto
foi esse faturamento.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] semanaUm = new Double[]{1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0};
        Double[] semanaDois = new Double[]{1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0};
        Double[] semanaTres = new Double[]{1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0};
        Double[] semanaQuatro = new Double[]{2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0};

        Double[][] mes = new Double[][]{semanaUm, semanaDois, semanaTres, semanaQuatro};

        double faturamentoSemanaUm = mes[0][0] + mes[0][1] + mes[0][2] + mes[0][3] + mes[0][4] + mes[0][5] + mes[0][6];
        double faturamentoSemanaDois = mes[1][0] + mes[1][1] + mes[1][2] + mes[1][3] + mes[1][4] + mes[1][5] + mes[1][6];
        double faturamentoSemanaTres = mes[2][0] + mes[2][1] + mes[2][2] + mes[2][3] + mes[2][4] + mes[2][5] + mes[2][6];
        double faturamentoSemanaQuatro = mes[3][0] + mes[3][1] + mes[3][2] + mes[3][3] + mes[3][4] + mes[3][5] + mes[3][6];

        boolean semanaUmMaior = faturamentoSemanaUm > faturamentoSemanaDois & faturamentoSemanaUm > faturamentoSemanaTres
                & faturamentoSemanaUm > faturamentoSemanaQuatro;

        boolean semanaDoisMaior = faturamentoSemanaDois > faturamentoSemanaUm & faturamentoSemanaDois > faturamentoSemanaTres
                & faturamentoSemanaDois > faturamentoSemanaQuatro;

        boolean semanaTresMaior = faturamentoSemanaTres > faturamentoSemanaUm & faturamentoSemanaTres > faturamentoSemanaDois
                & faturamentoSemanaTres > faturamentoSemanaQuatro;
        

        if (semanaUmMaior) {
            System.out.println("primeira semana teve o faturamento maior , valor do faturamento: " + faturamentoSemanaUm);
        } else if (semanaDoisMaior) {
            System.out.println("a segunda semana  teve o faturamento maior , valor do faturamento: " + faturamentoSemanaDois);
        } else if (semanaTresMaior) {
            System.out.println("a terceira semana teve o faturamento maior , valor do faturamento:  " + faturamentoSemanaTres);
        } else {
            System.out.println("a quarta semana teve o faturamento maior , valor do faturamento: " + faturamentoSemanaQuatro);
        }

//        System.out.println("\nprimeira semana: " + faturamentoSemanaUm);
//        System.out.println("\nsegunda semana: " + faturamentoSemanaDois);
//        System.out.println("\nterceira semana: " + faturamentoSemanaTres);
//        System.out.println("\nquarta semana: " + faturamentoSemanaQuatro); //mostrar todos faturamentos

        scanner.close();
    }
}
