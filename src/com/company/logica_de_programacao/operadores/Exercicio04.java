package com.company.logica_de_programacao.operadores;

/*
Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência,
depois verifique se ela pode aposentar ou não.
Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos
e ter contribuído com, pelo menos, 25 anos.
Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
 */

import java.util.Scanner;

public class Exercicio04 {
    
    static final int IDADE_MINIMA_PARA_APOSENTAR = 55;
    static final int CONTRIBUICAO_MINIMA_COM_PREVIDENCIA_PARA_APOSENTAR = 25 ;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite sua idade: ");
        int informeAIdade = scanner.nextInt();
        System.out.print("\nQuantidade de tempo que contribuiu com previencia: ");
        int informeTempoComPrevidencia = scanner.nextInt();
        boolean requisitosMinimos = informeAIdade >= IDADE_MINIMA_PARA_APOSENTAR & informeTempoComPrevidencia >= CONTRIBUICAO_MINIMA_COM_PREVIDENCIA_PARA_APOSENTAR;
        if(requisitosMinimos){
           System.out.println("\nOS Dados informados indica que o Senhor ou a Senhora pode-se aposentar");
        } else {
           System.out.println("\nOs dados informados indica que o Senhor ou a Senhora não pode-se aposentar");
        }
    }
}
