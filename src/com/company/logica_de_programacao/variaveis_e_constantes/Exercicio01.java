package com.company.logica_de_programacao.variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        Integer valorDoFrete = 2;
        Double resultado = valorProduto + valorDoFrete;
        System.out.println("Valor do Produto com frete é: " + resultado);
        scanner.close();
    }
}
