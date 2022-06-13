package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_objeto_this_e_construtores;

public class ContaPagar {
    String descricao;
    double valor;
    String dataVencimento;
    Fornecedor fornecedor;

    public ContaPagar(){

    }
    public ContaPagar(String descricao, double valor, String dataVencimento, Fornecedor fornecedor ) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        System.out.println("Conta a Pagar " + this.getDescricao()
                           + " valor " + this.getValor() +
                             " Data de vencimento: " + getDataVencimento() +
                             " fornecedor: " + this.getFornecedor().getNome() + ".");
    }
}
