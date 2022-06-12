package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_objeto_this_e_construtores;
/*
criar o código-fonte das classes ContaPagar e Fornecedor.
Note que existem dois construtores na classe ContaPagar,
sendo um construtor padrão (sem parâmetros),
que não deve fazer nada,
e outro construtor que recebe alguns parâmetros e deve atribuir os valores recebidos às variáveis de instância.

Quando desenhamos diagramas de classes, não há necessidade de mostrar os métodos getters e setters de JavaBeans.

O método pagar() deve apenas exibir na tela as informações do pagamento (descrição da conta, valor, data de vencimento e nome do fornecedor).
Quando finalizar a criação das classes ContaPagar e Fornecedor, crie uma outra classe chamada Principal com o código-fonte abaixo:

public class Principal {
    	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);
		ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");
		conta1.pagar();
		conta2.pagar();
		conta3.pagar();
	}
}
Agora compile e execute a classe Principal. Evite ver a resolução do desafio antes de resolver os problemas sozinho.
Bom trabalho! :)
*/
public class Desafio {
}
