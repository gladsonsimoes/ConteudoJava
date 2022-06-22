package com.company.orientacao_a_objetos.topicos_avancados._6_18_ordenando_objetos;

import java.util.Comparator;
/* Usamos Comparator quando existe mais de uma maneira de comparar os dois objetos.
 Para usar a interface Comparator, a classe deve implementar o método compare()
 Ele pode ser usado para comparar dois objetos de uma forma que pode não se alinhar com a ordem natural do objeto */
public class IdadeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        if (p1.getIdade() < p2.getIdade()) {
            return -1;
        } else if (p1.getIdade() > p2.getIdade()){
            return 1;
        }
        return 0;
    }
}
