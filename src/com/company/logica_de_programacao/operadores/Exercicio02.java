package com.company.logica_de_programacao.operadores;
/*
Crie um programa que receba o valor de um produto
e exiba o valor final da compra.
 Esse valor final será o valor do
produto mais o valor do frete use o valor do frete como R$15,00.

 Uma compra de, por exemplo, R$80,00, teria um valor
final de R$95,00.
Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.

*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de um produto: ");
        Double informeOValorProduto = scanner.nextDouble();
        Double valorFrete = 15.00;
        Boolean produtoNaoCobrado = informeOValorProduto >= 100;

        if (produtoNaoCobrado){
            System.out.println("Valor Final : " + (informeOValorProduto));
        } else {
            System.out.println("Valor Final : " + (informeOValorProduto+valorFrete));
        }

    }
}
