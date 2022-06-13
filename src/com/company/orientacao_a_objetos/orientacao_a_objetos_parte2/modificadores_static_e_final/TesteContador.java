package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.modificadores_static_e_final;
public class TesteContador {
    public static void main(String[] args) {
        Contador c = new Contador();

        c.incrementar(); // usando o metodo incrementar para acessar a incrementacao de COUNT
        System.out.println(Contador.COUNT);

        Contador.COUNT++;  //  usando o COUNT diretamente da Classe Contador
        System.out.println(Contador.COUNT);

        for (int i = 0 ; i <= 11 ; i++){  // para repetir mais vezes sem digitar o codigo toda hora
            Contador.COUNT++;
            System.out.println(+ Contador.COUNT);
        }
        Contador.imprimirContador();
    }
}
