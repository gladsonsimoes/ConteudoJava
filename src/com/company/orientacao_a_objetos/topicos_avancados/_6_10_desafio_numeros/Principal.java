package com.company.orientacao_a_objetos.topicos_avancados._6_10_desafio_numeros;

/*Desenvolva um programa que:

        Recebe como parâmetro do usuário o valor de um produto do tipo double.
        Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
        Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.

        Formata o novo valor calculado para o padrão monetário (R$).
        Exibe na tela o valor calculado e formatado.*/

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatDecimal = new DecimalFormat("RS #,##0.00");

        System.out.println("Valor do produto");
        double valor = scanner.nextDouble();

        BigDecimal valorBig = new BigDecimal(valor);
        BigDecimal resultado = valorBig.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
        String valorFormatado = formatDecimal.format(resultado.doubleValue());
        System.out.println("10% do valor é: " + valorFormatado);
    }
}
