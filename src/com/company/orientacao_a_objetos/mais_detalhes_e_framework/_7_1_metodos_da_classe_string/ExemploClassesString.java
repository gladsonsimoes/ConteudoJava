package com.company.orientacao_a_objetos.mais_detalhes_e_framework._7_1_metodos_da_classe_string;

public class ExemploClassesString {

    public static void main(String[] args) {
        String s = "Gladson Silva Simões";

//      System.out.println(s.charAt(0)); //imprime a letra do local 0
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(10));

//        System.out.println(s.length());

//        char[] array = {'O' , 'L' , 'A'};
//        String s1 = new String(array);
//        System.out.println(s1);

//         String s2 = "Desenvolvimento Java";
//         System.out.println(s2.substring(16)); //a partir do 16 pega o restante
//         String s3 = "Cursos online de desenvolvimento de software";
//         System.out.println(s3.substring(7,12)); //selecionando o 7 e 12 só vai imprimir dentro do limite

//           String s4 = "Cursos_online_de_desenvolvimento_de_software";
//           String[] array1 = s4.split("_");
//           for (int i = 0; i < array1.length; i++ ){
//               System.out.println("[" + i + "]=" + array1[i]);
//           }

//        String s5 = "     Filipe    ";
//        System.out.println(">" + s5 + "<");
//        System.out.println(">" + s5.trim() + "<"); //trim tira os espaços em branco

//        String s6 = "Java";
//        int indice = s6.indexOf('a'); //o indexOf ele faz a leitura da palavra
//        System.out.println(indice);
//        indice = s6.indexOf('v');
//        System.out.println(indice);

        String s7 = "Desenvolvimento Java";
        System.out.println(s7.replaceAll("Java " , "de software")); //replaceAll faz a troca

    }

}
