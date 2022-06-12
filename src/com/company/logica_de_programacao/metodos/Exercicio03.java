package com.company.logica_de_programacao.metodos;

/*
Crie uma pequena calculadora de subtração e adição.
-------------------------------------------------------
Crie um programa que peça dois números do usuário

 e também qual a operação ele deseja fazer adição ou subtração.

 Para cada operação,
 você deve construir um método que realize a mesma,

  ou seja, teremos um método para adição,
 que vai receber dois números como parâmetros e retornar o resultado da soma entre eles,

  e outro método para subtração.
Fique a vontade para implementar multiplicação e divisão também.
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        inserirprimeironumero("Digite um numero: " , scanner);

        inserircaractere("Insira um simbolo : + somar , - subtrair " , scanner);

        inserirsegundonumero("Digite outro numero : " , scanner);
        

    }
    static void imprimir(String texto) {
        System.out.print(texto);
    }
    static Double inserirprimeironumero (String texto , Scanner scanner) {
        imprimir(texto);
          Double primeiroNumero = scanner.nextDouble();
          return primeiroNumero;
    }
    static Character inserircaractere (String texto , Scanner scanner){
        imprimir(texto);
        char operacao = scanner.next().charAt(0);
        return operacao;
    }
    static Double inserirsegundonumero(String texto , Scanner scanner){
        imprimir(texto);
        Double segundoNumero = scanner.nextDouble();
        return segundoNumero;
    }
    
    static void operacaoInvalida() {
        System.err.println("Operação Invalida");
        System.exit(1);
    }
}
