package com.company.orientacao_a_objetos.topicos_avancados._6_3_desafio_java_lang_math;

public class MegaSena {
    private static final int QUANTIDADE_MARCADA = 6; //em constante me lembro com pouca frequencia
    private static final int NUMEROS_DISPONIVEIS = 60;
    private int[] numerosSorteados;

    public void sortear(){
        numerosSorteados = new int[QUANTIDADE_MARCADA];
        for (int i = 1 ; i <= numerosSorteados.length ; i++) {
            System.out.println(Math.round(Math.random() * NUMEROS_DISPONIVEIS));
        }
    }
    public void verificarNumero(int jáSorteado){  //vericação de numero dei uma travada!

    }
}
