package com.company.orientacao_a_objetos.topicos_avancados._6_7_trabalhando_com_datas;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {

    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatador.format(hoje));

        String dataAniversario = "20/01/1985"; //aqui foi criado uma data de aniversario como uma String com o formator padrao!
        DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy"); //aqui foi criado "formatador2" e um SImpleDateFormat para definir o formato do dia

        try{
            Date aniversario = formatador2.parse(dataAniversario); //criando um Date "aniversario", e o parse converte String em formato em Date para o Java dectectar que é uma Data
            System.out.println(formatador2.format(aniversario)); //printando o Date "aniversario"!
        } catch (ParseException e){ //em caso de data invalida na linha 18!
            System.err.println("Formato de data inválido");
        }
    }
}
