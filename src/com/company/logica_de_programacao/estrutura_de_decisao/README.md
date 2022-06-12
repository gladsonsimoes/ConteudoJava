# Estrutura de decisao

 ### - Exemplo if e else
 ~~~~~java
    if (notaAluno >=6 | notaAluno == 10){
     System.out.println("aprovado");
   } else if (notaAluno >= 3 | notaAluno == 5) {
     System.out.println("recuperação");
   } else if (notaAluno > 10 | notaAluno < 0) {
     System.err.print("nota inválida");
   } else {
     System.out.println("reprovado");
   }
~~~~~~
### - Exemplo switch:
~~~java
 //para funcionar do jeito if o codigo ficaria muito longo. 
 //Ou seja colocar cada numero para representa o case , nesse caso o switch não seria uma boa opção!
 //mas tem situações que o torna util e mais facil.
    
    switch(notaAluno){  
      case 10 : situacao = "aprovado";
        break;
      case 0 : situacao = "reprovado";
        break;
      default :
        System.err.println("número inválido");
        System.exit(1);
     }
      System.out.println("o aluno está: " + situacao)
~~~ 
