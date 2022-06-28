package com.company.orientacao_a_objetos.serializacao_de_objetos._9_1_salvando_e_lendo_objetos_em_arquivo.model;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeserializacaoObjeto { //pega um arquivo e converter em um objeto

    public static void main(String[] args) {
        try (ObjectInput in = new ObjectInputStream(Files.newInputStream(Paths.get("joao.obj")))) {
            Pessoa p = (Pessoa) in.readObject();
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Profissão: " + p.getProfissao());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Erro convertendo para a classe Pessoa");
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }
}
