package com.company.logica_de_programacao.programacao_orientada_a_objetos.classe_instancia;

public class ClasseInstancia {

    public static void main(String[] args) {
        System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque); //propriedade da classe

        Produto produto =  new Produto();
        produto.nome = "Caneca"; //propriedade do objeto

        Produto.quantidadeMinimaEstoque = 11;
        System.out.println("Quantidade minima: " + Produto.quantidadeMinimaEstoque);

        Produto produto2 = new Produto();
        produto2.nome =  "Carteira";

        System.out.println("Quantidade minima: " + Produto.quantidadeMinimaEstoque);

        System.out.println("Produto 1: " +  produto.getNome());
        System.out.println("Produto 2: " + produto2.getNome());

        Impressao.informacao("Produto 1: " + produto.getNome());
        Impressao.informacao("Produto 2: " + produto2.getNome());

        //Impressao.erro("Não tem");
    }
}
