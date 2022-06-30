package com.company.orientacao_a_objetos.novidades_do_java_7._10_1_separador_de_digitos_em_literais_numericos;

//novidades do java 7 é que adicionaram o underline entre os numeros para separar!
public class ExemploSeparadorDigitosLiterais {
    public static void main(String[] args) {
        long populacaoSaoPaulo = 11_000_000L;
        long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;

        System.out.printf("População São Paulo: %d\n" , populacaoSaoPaulo); //printf nesse caso pode se usar a virgula em vez do +
        System.out.printf("População da Grande São Paulo: %d\n" , populacaoGrandeSaoPaulo );

        double precoVeiculo = 200_000_99_1d;
        System.out.printf("Preço veículo: %.3f\n" , precoVeiculo + precoVeiculo);

        //Evitar usar assim
        int x = 1___2___3;
        int y = 1_2_3;
        System.out.printf("São iguais: %b\n" , (x == y));
    }
}
