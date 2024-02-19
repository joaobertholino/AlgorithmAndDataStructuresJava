package com.joaobertholino.vectorsandarrays.exercises.test;

import com.joaobertholino.vectorsandarrays.exercises.vector.Vector;

public class App {
  public static void main(String[] args) throws Exception {

    Vector<String> exercicesOne = new Vector<>(6);
    exercicesOne.addMethod("A", 0);
    exercicesOne.addMethod("B", 1);
    exercicesOne.addMethod("C", 2);
    exercicesOne.addMethod("D", 3);
    exercicesOne.addMethod("E", 4);
    exercicesOne.addMethod("F", 5);
    System.out.println(exercicesOne);

//    Exercicio um => Criar um método que verifica se um determinado elemento existe no array.
    boolean resultOne = exercicesOne.containsMethod("B");
    System.out.println(resultOne);

//    Exercicio dois => Criar um método que retorna o indice da ultima ocorrencia do elemento passado.
    int resultTwo = exercicesOne.lastIndexMethod("E");
    System.out.println(resultTwo);

//    Exercicio tres => Criar um método que remove um elemento de uma determinada posição.
    exercicesOne.removeMethod(3);
    System.out.println(exercicesOne);

//    Exercicio quatro => Criar um método que retorna o elemento referente ao indice passado como argumento.
    String resultThree = exercicesOne.getMethod(3);
    System.out.println(resultThree);

//    Exercicio cinco => Criar um método que limpa por completo o array.
    exercicesOne.clearMethod();
    System.out.println(exercicesOne);

  }
}
