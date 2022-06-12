package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.sobreposicao_5_16;

import java.util.Date;
import java.util.Scanner;

public class TesteSobreposicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "Carne";
        pp.dataValidade = new Date(); //Date java.util puro utiliza a Data de hoje!

        ProdutoPerecivel pp2 = new ProdutoPerecivel(); //modificado

        pp2.descricao = scanner.nextLine();
        System.out.println("\"" + pp2.descricao + "\"");
        pp2.dataValidade = new Date( 2022 ,0 , 2 , 1 , 3 , 22 ); //Data de vencimento selecionado
        pp2.identificar();


    }
}
