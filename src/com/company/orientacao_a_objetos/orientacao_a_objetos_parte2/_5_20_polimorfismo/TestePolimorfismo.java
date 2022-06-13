package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_20_polimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);
        TestePolimorfismo.imprimirSaldo(conta);
        System.out.println();
        //-----------------------------------------
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);
        System.out.println();
        //-----------------------------------------
        Conta  contaPoupanca = new ContaPoupança(); //extends conta
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);
    }
    private static void imprimirSaldo(Conta conta){
        System.out.println("Saldo da conta: R$" + conta.getSaldo());
        if(conta instanceof ContaCorrente){ //ela aponta a instancia da ContaCorrente
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da cc é R$" + cc.getLimite());
        }
        if (conta instanceof ContaPoupança){ //instanceof operador de comparação
            ContaPoupança cp = (ContaPoupança) conta;
            System.out.println("O rendimento da cp é R$" + cp.getRendimentos());
        }
    }
}
