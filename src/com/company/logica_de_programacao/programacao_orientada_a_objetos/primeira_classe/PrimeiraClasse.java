package com.company.logica_de_programacao.programacao_orientada_a_objetos.primeira_classe;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 15;

       exibirQuantidadeEmEstoque(produto);
    }

    static void exibirQuantidadeEmEstoque(Produto produto){
        System.out.println("\nQuantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade );
        System.out.println("Preço de cada um " + produto.precoUnitario );
    }
}
