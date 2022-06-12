package com.company.logica_de_programacao.operadores;
/*        Para criar uma calculadora simples você vai precisar receber três informações pelo console.
 São os dois números que
        participarão da operação e também a operação que será realizada.

        Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.

        Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos
        aqui no curso - o *Scanner*.

        Para receber a operação você pode receber também um número que vai indicar a mesma.
        Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.

        Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if
        para só realizar a operação que o usuário escolheu. Se estiver com dúvidas*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numeroDigitado1 = scanner.nextDouble();
        System.out.println(" + (soma) , - (subtração) , * (multiplicação) , / (divisao) ");
        char operacao = scanner.next().charAt(0);

        if (operacao == '+') {
            System.out.print("\nDigite outro numero: ");
            double numeroDigitado2 = scanner.nextDouble();
            System.out.print("Resultado: " +numeroDigitado1 + " + " + numeroDigitado2+  " = " + Math.ceil(numeroDigitado1 + numeroDigitado2));
        } else if (operacao == '-'){
            System.out.print("\nDigite outro numero: ");
            double numeroDigitado2 = scanner.nextDouble();
            System.out.print("Resultado: " + numeroDigitado1 + " - " + numeroDigitado2 + " = " + Math.ceil(numeroDigitado1-numeroDigitado2));
        } else if (operacao == '*'){
            System.out.print("\nDigite outro numero: ");
            double numeroDigitado2 = scanner.nextDouble();
            System.out.println("Resultado: " + numeroDigitado1 + " * " + numeroDigitado2 + " = " + Math.ceil(numeroDigitado1*numeroDigitado2));
        } else if (operacao == '/'){
            System.out.print("\nDigite outro numero: ");
            double numeroDigitado2 = scanner.nextDouble();
            System.out.println("Resultado: " + numeroDigitado1 + " / " + numeroDigitado2 + " = " + Math.ceil(numeroDigitado1/numeroDigitado2));
        } else {
            System.out.println("esse operador não existe!");
        }
    }
}

