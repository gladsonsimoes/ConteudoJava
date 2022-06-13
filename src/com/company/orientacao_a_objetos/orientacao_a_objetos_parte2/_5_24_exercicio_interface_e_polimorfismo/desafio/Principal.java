package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_24_exercicio_interface_e_polimorfismo.desafio;

public class Principal {
    public static void main(String[] args) {
      CorretoraSeguros corretora = new CorretoraSeguros();

      Carro meuCarro = new Carro(45000, 2012); //objeto "meuCarro" usando o construtor da classe carro
      Imovel minhaCasa = new Imovel(920000,320);

    //(abaixo) - objeto "corretora" acessando "fazerPropostaSeguro" da classe "CorretoraSeguros" , instanciando o objeto da classe Carro
      corretora.fazerPropostaSeguro(meuCarro);
      corretora.fazerPropostaSeguro(minhaCasa);
    }
}
