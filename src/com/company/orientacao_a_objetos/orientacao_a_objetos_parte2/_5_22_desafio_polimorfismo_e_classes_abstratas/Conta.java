package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_22_desafio_polimorfismo_e_classes_abstratas;

public abstract class Conta {
    protected SituacaoConta situacaoConta;
    String descricao;
    double valor;
    String dataVencimento;

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void cancelar() {
        if (SituacaoConta.PAGA.equals(this.getsituacaoConta())) {
            System.out.println("não pode cancelar uma conta que já foi paga: " + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getsituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + ".");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    public SituacaoConta getsituacaoConta() {
        return situacaoConta;
    }

    public abstract void exibirDetalhes();
}
