package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_22_desafio_polimorfismo_e_classes_abstratas;

public class ContaReceber extends Conta {
    private Cliente cliente;

    public void receber() {
        System.out.println("Recebendo a conta: " + this.getDescricao()
                + " no valor de  " + this.getValor() +
                " e vencimento em " + getDataVencimento() +
                " fornecedor: " + this.getCliente().getNome() + ".");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ContaReceber() {
    }

    public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }
    public void cancelar() {
        if (valor >= 50000d) {
            System.out.println(this.getDescricao() + " a conta a receber não pode ser cancelada , pois o valor: " + this.getValor() + " é muito dinheiro para cancelar ");
        } else {
            super.cancelar(); //o super vai pegar o metodo da Classe Conta , em vez de rescrever o metodo.
        }
    }
    public void exibirDetalhes(){
            System.out.println("Conta a receber");
            System.out.println("=======================");
            System.out.println("Cliente: " + this.getCliente().getNome());
            System.out.println("Descrição: " + this.getDescricao());
            System.out.println("Valor: " + this.getValor());
            System.out.println("Vencimento: " + this.getDataVencimento());
            System.out.println("Situação: " + this.getsituacaoConta());
            System.out.println("========================");
            System.out.println();
    }

}
