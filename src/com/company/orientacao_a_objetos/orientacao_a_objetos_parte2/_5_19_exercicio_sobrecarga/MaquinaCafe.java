package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_19_exercicio_sobrecarga;

public class MaquinaCafe {
    boolean acucarDisponivel = false;

 public void fazercafe(boolean acucarDisponivel){
         if (acucarDisponivel == false){
             System.out.println("Acabou o açúcar");
         } else {
             System.out.println("Quantidade suficiente de açúcar");
         }
 }
    public void fazercafe(){
        armazenar(acucarDisponivel);
    }
    private void armazenar(boolean acucarDisponivel) {
        if (acucarDisponivel == false) {
            System.out.println("Fazendo café sem açúcar!");
        } else {
            System.out.println("Fazendo café com açúcar!");
        }
    }
}
