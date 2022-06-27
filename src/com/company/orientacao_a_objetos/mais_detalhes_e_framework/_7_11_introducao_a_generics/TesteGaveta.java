package com.company.orientacao_a_objetos.mais_detalhes_e_framework._7_11_introducao_a_generics;

public class TesteGaveta {
    public static void main(String[] args) {

        Gaveta<String> gaveta = new Gaveta<>(); //definindo uma Lista do tipo STring da Classe Gaveta
        gaveta.colocar("Livro de Java"); //acessando o metodo colocar da classe Gaveta
        System.out.println(gaveta.retirarPrimeiro());

        Gaveta<Integer> gavetaNumeros = new Gaveta<>();
        gavetaNumeros.colocar(4);
        System.out.println(gavetaNumeros.retirarPrimeiro() + 2);

    }
}
