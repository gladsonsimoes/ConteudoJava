package com.company.orientacao_a_objetos.topicos_avancados._6_4_tratando_e_lancando_excecoes;

public class TesteExcecoesChecadas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);

        try { //tentativa
            cc.sacar(60); //pegando o construtor "sacar"
        } catch (SaldoInsuficienteException e){ //catch é  um tipo de vericação
            System.out.println("Desculpe, saldo insuficiente.");
        }
        System.out.println("Saldo: " + cc.getSaldo());

        try {
            cc.sacar(50);
        } catch (SaldoInsuficienteException e){ //ele criou esta classe para extender do java , o "e" é de Exception
            System.out.println("Desculpe, saldo insuficiente.");
        }
        finally { //para limpar a memoria do computador e mostrar a mensagem final
            System.out.println("Obrigado por utilizar nosso sistema!");
        }
        System.out.println("Saldo agora: " + cc.getSaldo());
    }
}
