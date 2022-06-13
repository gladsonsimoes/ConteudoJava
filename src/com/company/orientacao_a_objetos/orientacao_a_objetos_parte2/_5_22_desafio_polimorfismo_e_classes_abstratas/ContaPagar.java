package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_22_desafio_polimorfismo_e_classes_abstratas;


public class ContaPagar extends Conta {
    private Fornecedor fornecedor;

    public ContaPagar() {
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        System.out.println("Pagando conta " + this.getDescricao()
                + " valor " + this.getValor() +
                " Data de vencimento: " + getDataVencimento() +
                " fornecedor: " + this.getFornecedor().getNome() + ".");
    }

    public void cancelar() {
        System.out.println("Cancelando a conta acima");
    }

    public void exibirDetalhes(){
        System.out.println("\nConta a Pagar");
        System.out.println("=============================");
        System.out.println("Fornecedor: " + this.getFornecedor().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Data de vencimento: " + this.getDataVencimento());
        System.out.println("Situação: " + this.getsituacaoConta());
    }
}
