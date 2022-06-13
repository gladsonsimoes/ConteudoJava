package com.company.orientacao_a_objetos.topicos_avancados._6_6_classes_stringBuffer_e_stringBuilder;

public class TesteStrings {
    public static void main(String[] args) {
        String s = "Olá "; //sem StringBuilder
        s = s + "Pessoal!"; //a String s , foi adicionada mais uma palavra " Pessoal!"

        System.out.println(s);  //usado para printar na tela!

        StringBuilder sb = new StringBuilder("Olá"); //com StringBuilder
        sb.append(" Pessoal!"); //append é para acrescentar

        String resultado = sb.toString(); //converti o "sb" como uma String usando toString();
        System.out.println("com StringBuilder: " + resultado);

    }
}
