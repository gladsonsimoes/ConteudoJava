package com.company.orientacao_a_objetos.topicos_avancados._6_2_classe_java_lang_math;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {
    public static void main(String[] args) {

        //Comprimento de um circunferência 2 x r x PI (3,1415)
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento: " + comprimento);

        //Máximo e mínimo
        double[] precosProdutoA = {30.20,25.49}; //vetor com tipo primitivo!
        double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("Maior preco: " + maiorPreco);
        System.out.println("Menor preco: " + Math.min(precosProdutoA[0], precosProdutoA[1]));

        //Potência
        System.out.println("2^3: " + Math.pow(2 , 3));

        //Raiz quadrada
        System.out.println("Raiz de 9: " + Math.sqrt(9));

        //Arredondamento ceil, floor e round
        double n = 5.4;
        System.out.println("Menor inteiro: " + Math.floor(n)); //floor , arrendondar pra baixo
        System.out.println("Maior inteiro: " + Math.ceil(n)); //ceil , arrendondar pra cima
        System.out.println("Arredondamento: " + Math.round(n)); //round , arrendondamento proximo

        //Trigonometria
        System.out.println("Seno: " + Math.sin(40));

        //Números randomicos
        double numeroAleatorio = Math.random() * 100; //random seleciona numeros aleatorios
        System.out.println(numeroAleatorio);

    }
}
