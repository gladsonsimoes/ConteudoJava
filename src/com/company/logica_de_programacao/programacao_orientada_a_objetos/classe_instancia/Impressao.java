package com.company.logica_de_programacao.programacao_orientada_a_objetos.classe_instancia;

public class Impressao {
//static é um metodo para usar a variavel que está na classe sem invocar ela
// Invocação é ( Impressao impressao = new Impressao(); )
// em vez disso usando só classe e ponto!
    static void informacao(String texto){ System.out.println("[INFO] " + texto); }

    static void erro(String texto){ System.err.println("[ERRO] " + texto); }
}
