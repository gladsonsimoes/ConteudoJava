package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_heranca_e_sobreposicao_5_17;

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
}
