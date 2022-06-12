package com.company.logica_de_programacao.operadores;
/*
Faça um programa que receba:
O valor da conta de luz
Conta de água
Conta de telefone
Escola do filho
Fatura do cartão
Gastos com supermercado

... e mostre o gasto total que a família teve no mês.
 "Não esqueça de usar muito o operador" = "+=".
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        System.out.print("\nDigite o valor da conta de luz");
        System.out.print("\nR$: ");
        total += scanner.nextDouble();
        System.out.print("\nDigite o valor da Conta de água");
        System.out.print("\nR$: ");
        total += scanner.nextDouble();
        System.out.print("\nDigite o valor da Conta da Escola");
        System.out.print("\nR$: ");
        total += scanner.nextDouble();
        System.out.print("\nDigite o valor da Fatura do Cartão");
        System.out.print("\nR$: ");
        total += scanner.nextDouble();
        System.out.print("\nDigite o valor dos Gastos do supermercado");
        System.out.print("\nR$: ");
        total += scanner.nextDouble();

        System.out.print("\nGastos do Mês \nR$: " + total + "\n");
    }
}

