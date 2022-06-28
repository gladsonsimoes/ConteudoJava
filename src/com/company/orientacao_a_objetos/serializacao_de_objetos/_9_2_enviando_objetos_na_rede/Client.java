package com.company.orientacao_a_objetos.serializacao_de_objetos._9_2_enviando_objetos_na_rede;

import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.1" , 3333);

        OutputStream saida = socket.getOutputStream();
        ObjectOutput objectOutput = new ObjectOutputStream(saida);

        Pedido pedido = new Pedido();
        pedido.setCodigo(2l);
        pedido.setDescricao("Pasta de dente");
        pedido.setQuantidade(2);

        objectOutput.writeObject(pedido);

        //receber objeto pela rede

        InputStream entrada = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(entrada);
        System.out.println("Recebeu do servidor: " + dataInputStream.readUTF());

        socket.close();


    }
}
