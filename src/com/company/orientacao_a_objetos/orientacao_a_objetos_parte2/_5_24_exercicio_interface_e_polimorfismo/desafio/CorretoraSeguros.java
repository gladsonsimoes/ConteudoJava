package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_24_exercicio_interface_e_polimorfismo.desafio;

public class CorretoraSeguros  {

    public void fazerPropostaSeguro(Seguravel objetoSeguravel){ //criando um parametro usando interface.
        System.out.println("------------------------------------");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("------------------------------------");
        //(abaixo) - objeto "objetoSeguravel" acessando o metodo "obterDescricao" da instancia Seguravel
        System.out.println(objetoSeguravel.obterDescricao());
        //(abaixo) - objeto  "objetoSeguravel" acessando o metodo "calcularValorApolice" da instancia Seguravel
        System.out.println("Valor da Apólice: " + objetoSeguravel.calcularValorApolice());
        System.out.println("-------------------------------------\n");
    }
}
