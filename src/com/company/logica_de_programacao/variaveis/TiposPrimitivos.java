package com.company.logica_de_programacao.variaveis;

import java.util.Scanner;
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String variavelString = ""; // o tipo String não possui um tipo primitivo equivalente
       
        byte variavelByte = 1; // o tipo byte, assim como os outros primitivos, não pode manter um estado de ausência de valor.
        //Lembrando que ausência de valor é representada pela palavra null que significa nulo.

        short variavelShort = 1;

        int variavelInteger = 1; // o tipo normal de int é Integer

        long variavelLong = 1L;

        //tipo normal = Float , tipo Primitivo = float.
        float variavelFloat = 1.0f;
        
        //-------------------------------------------------------------------------------------------------------
            
        //tipo normal é Double e o tipo primitivo é double:

        double variavelDouble = 1.0; //variavel double declarando um numero real.
        //ao declarar número real não use virgula e sim ponto para não dar erro , exemplo 1.0 !
        double variavelInformeDouble = scanner.nextDouble(); //variavel double esperando algum numero real ou inteiro do usuario.
        //Ao digitar  no console um número real não use ponto e sim virgula para não dar erro , exemplo 1,0 !

       //---------------------------------------------------------------------------------------------------------
           
        // tipo normal é Character e o tipo primitivo é char :
        
        char variavelCharacter = 'A'; //variavel char declarando um caractere
        //usar aspas simples (')  , e pode ser usado um simbolo , um numero ou uma letra!.
        char variavelInformeCharacter = scanner.nextLine().charAt(0); //variavel char esperando algum caractere do usuario.
        //digite um simbolo , um numero ou uma letra!
        
        //---------------------------------------------------------------------------------------------------------
            
        // tipo normal é Boolean e o tipo primitivo é boolean:

        boolean variavelBoolean = true;
    }
}
