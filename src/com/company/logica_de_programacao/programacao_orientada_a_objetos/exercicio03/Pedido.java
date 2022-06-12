package com.company.logica_de_programacao.programacao_orientada_a_objetos.exercicio03;

/*

O conceito de pedido de vendas será abstraído em uma classe que você irá chamar de Pedido.
 Essa classe terá 4 atributos: código, subtotal, desconto e total.

 */

public class Pedido {

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }


    int codigo;
    int subtotal;
    int desconto;


    public int getTotal() {
        return subtotal - desconto;
    }

}
