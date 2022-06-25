package com.company.orientacao_a_objetos.mais_detalhes_e_framework._7_3_joptionpane;

import javax.swing.*;
//Java Swing e JOPtionPane
public class ExemploJOptionPane1 {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

            JOptionPane.showMessageDialog(null, "Seu Cadastro foi realizado com sucesso!");
    }
}
