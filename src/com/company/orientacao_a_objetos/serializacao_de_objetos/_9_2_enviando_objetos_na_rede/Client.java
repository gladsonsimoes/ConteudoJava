package com.company.orientacao_a_objetos.serializacao_de_objetos._9_2_enviando_objetos_na_rede;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.1" , 3333); //acessar o ip do servidor e a porta

        OutputStream saida = socket.getOutputStream(); //receber o ip do cliente //para receber

        ObjectOutput objectOutput = new ObjectOutputStream(saida); //Output para enviar

        Pedido pedido = new Pedido(); //algo que desejo enviar
        pedido.setCodigo(2l);
        pedido.setDescricao("Pasta de dente");
        pedido.setQuantidade(2);

        objectOutput.writeObject(pedido); //ele envia o pedido para o " InputStream entrada = socket.getInputStream(); "


        //receber objeto pela rede
        InputStream entrada = socket.getInputStream(); //envia
        DataInputStream dataInputStream = new DataInputStream(entrada); //envia
        System.out.println("Recebeu do servidor: " + dataInputStream.readUTF());

        socket.close();

        //InputStream = enviar
        //DataInputStream = enviar

    }
}
