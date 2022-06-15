package com.company.orientacao_a_objetos.topicos_avancados._6_9_trabalhando_com_numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        double valorProduto = 13.5;

        System.out.println(valorProduto);
        System.out.println(formatador.format(valorProduto));

        String entrada = "R$ 50,35";
        try{
            double numero = formatador.parse(entrada).doubleValue(); //passando a "entrada" e convertando em double usando "doubleValue()" !
            System.out.println("Número: " + numero);
        } catch (ParseException e){ //excessao parse , pode ser usado Exception , mas como sei que vem do parse eu usei ParseException
            System.err.println("Entrada inválida");
        }

        BigDecimal bg = new BigDecimal("5131231231000"); //BigDecimal para colocar altos valores!
        bg = bg.divide(BigDecimal.TEN); //divindo o bg por 10
        System.out.println(bg);

    }
}
