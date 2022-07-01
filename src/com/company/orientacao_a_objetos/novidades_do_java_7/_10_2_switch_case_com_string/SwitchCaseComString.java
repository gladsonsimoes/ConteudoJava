package com.company.orientacao_a_objetos.novidades_do_java_7._10_2_switch_case_com_string;

public class SwitchCaseComString {

    public static void main(String[] args) { //
        String carro = args.length > 0 ? args[0] : ""; // ? é para separar (pesquise mais!), essa linha é como fosse o if e else
        
        
        
        //antes do java 7 não podia fazer switch case com String como esse
        switch (carro){
            case "Audi":
                System.out.println("Alemão");
                   break;
            case "Ferrari":
                System.out.println("Italiano");
                break;
            case "Honda":
                System.out.println("Japonês");
                break;
            default:
                System.out.println("Não informou nenhum carro!");
                
           //só podia se usar String em estrutura de decisão usando apenas o if e else!
           if (carro.equals("Audi")){
            System.out.println("Alemão");
           } else if (carro.equals("Ferrari")){
            System.out.println("Italiano");
           } else if (carro.equals("Honda")){
            System.out.println("Japonês");
           } else {
            System.out.println("Não informou nenhum carro!");
        }  
    }
}
