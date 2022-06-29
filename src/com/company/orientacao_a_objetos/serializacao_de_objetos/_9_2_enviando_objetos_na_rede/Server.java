package com.company.orientacao_a_objetos.serializacao_de_objetos._9_2_enviando_objetos_na_rede;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket server = new ServerSocket(3333); //adicionando a porta do servidor

        System.out.println("Aguardando conexão...");
        Socket socket = server.accept(); //Ele para aqui e aguarda conexões
        System.out.println("Conectado a: " + socket.getRemoteSocketAddress());

        InputStream entrada = socket.getInputStream(); //getInputStream ele recebe um fluxo de dado
        
        ObjectInputStream objectInputStream = new ObjectInputStream(entrada);

        Pedido pedido = (Pedido) objectInputStream.readObject();
        System.out.println("codigo: " + pedido.getCodigo());
        System.out.println("Descrição: " + pedido.getDescricao());
        System.out.println("Quantidade: " + pedido.getQuantidade());

        OutputStream saida = socket.getOutputStream(); //recebendo do servidor
        DataOutput dataOutput = new DataOutputStream(saida); //recebendo do servidor
        dataOutput.writeUTF("Recebido com sucesso");

        server.close();

    }
}
