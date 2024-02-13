package com.joaobertholino.vector;

import java.util.Arrays;

/**
 * Declarando uma classe Vector onde a cada instancia, por meio de um construtor, cria
 * um novo vetor de tamanho referente ao valor passado como argumento
 */
public class Vector {
  private String[] elements;
  private int size;

  public Vector(int capacity) {
    this.elements = new String[capacity];
    this.size = 0;
  }

  /**
   * Declarando um método que percorre o array ate encontrar a primeira posição
   * igual a {@code null}, atribuindo o valor passado como argumento a essa
   * posição.
   */
  public void toAddMethodOne(String element){
    for (int i = 0; i < this.elements.length; i++) {
      if (this.elements[i] == null){
        this.elements[i] = element;
        break;
      }
    }
  }

  /**
   * Declarando um método que verifica se a prop size for menor que o tamanho do array,
   * adicionara o elemento passado como argumento ao final desse array.
   * <p>
   * Caso o size seja igual ou maior que o tamanho do array, sera lançado uma exceção.
   */
  public void toAddMethodTwo(String element) throws Exception {
    if (this.size < this.elements.length){
      this.elements[this.size] = element;
      this.size++;
    } else {
      throw new Exception("Array sem espaço!");
    }
  }

  /**
   * Declarando um método semelhante ao de de cima porem, retornando um boolean
   * e não lanaçando uma exceção.
   */
  public boolean toAddMethodThree(String element) {
    if (this.size < this.elements.length){
      this.elements[this.size] = element;
      this.size++;
      return true;
    }
    return false;
  }

  /**
   * Declarando um getter que retorna o valor da prop que indica o tamanho do array
   */
  public int getSize() {
    return size;
  }

  /**
   * Sobreescrevendo o método toString fazendo com que ele retorne o array por completo
   */
  @Override
  public String toString() {
    return Arrays.toString(elements);
  }
}
