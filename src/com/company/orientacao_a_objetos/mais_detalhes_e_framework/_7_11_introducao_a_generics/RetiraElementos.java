package com.company.orientacao_a_objetos.mais_detalhes_e_framework._7_11_introducao_a_generics;

import java.util.List;

public class RetiraElementos {     //classe resposavel somente para retirar elementos

    public static <T> T recuperarPrimeiro(List<T> lista){
        return lista.get(0); //retornando o primeiro elemento da posição 0
    }

}
