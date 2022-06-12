package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_heranca_e_sobreposicao_5_17;

public class ContaPagar extends Conta {
    Fornecedor fornecedor;

    //Inclua um atributo chamado "situacaoConta" do tipo SituacaoConta na classe ContaPagar.
    // desafio_pacotes_e_enumeracoes_5_13
    //Criando um atributo fica assim:

    private SituacaoConta situacaoConta;// - parte 1 do atributo

    public ContaPagar(){
            this.situacaoConta = SituacaoConta.PENDENTE;
    }
    public ContaPagar(Fornecedor fornecedor ,String descricao , double valor ,String dataVencimento){
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

    public SituacaoConta getSituacaoConta() { //atribuir o objeto SituacaoConta - parte2 do atributo
        return situacaoConta;
    }

    public void cancelar() {
        System.out.println("Cancelando a conta acima");
    }
    public void pagar() {
        System.out.println("Pagando conta " + this.getDescricao()
                + " valor " + this.getValor() +
                " Data de vencimento: " + getDataVencimento() +
                " fornecedor: " + this.getFornecedor().getNome() + ".");
    }
}
