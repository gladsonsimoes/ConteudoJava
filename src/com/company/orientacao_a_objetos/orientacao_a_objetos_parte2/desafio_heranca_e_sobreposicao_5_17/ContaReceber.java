package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_heranca_e_sobreposicao_5_17;

public class ContaReceber extends Conta {
    private Cliente cliente;

    public void receber(){
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
    public ContaReceber(){
    }
    public void cancelar() {
        if (valor >= 50000d) {
            System.out.println( this.getDescricao() + " a conta a receber não pode ser cancelada , pois o valor: " + this.getValor() + " é muito dinheiro para cancelar ");
        } else {
            System.err.println("Conta Cancelada está abaixo de 50mil!");
        }
    }
    public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento){
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }
}
