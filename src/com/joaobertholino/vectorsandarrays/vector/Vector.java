package com.joaobertholino.vectorsandarrays.vector;

import java.util.Arrays;

/**
 * Declarando uma classe vector onde a cada instancia, por meio de um construtor, cria
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
  public void toAddMethodOne(String element) {
    for (int i = 0; i < this.elements.length; i++) {
      if (this.elements[i] == null) {
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
    if (this.size < this.elements.length) {
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
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size++;
      return true;
    }
    return false;
  }

  /**
   * Declarando um getter que retorna o valor da prop que indica o tamanho do array.
   */
  public int getSize() {
    return size;
  }

  /**
   * Declarando método que retorna um elemento especifico do array com base no index passado como argumento, validando
   * esse valor passado por meio de uma condicional, lançando uma exceção caso o index passado seja invalido.
   */
  public String getElement(int index) throws Exception {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("Index invalido!");
    }
    return this.elements[index];
  }

  /**
   * Declarando método que verifica se o elemento passado como argumento existe no array.
   * <p>
   * Caso exista, ira retornar o indice desse elemento, caso contrario, retorna -1.
   */
  public int contains(String element) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Declarando método que recebe um elemento e um indice inteiro como argumento, adicionando esse elemento na
   * posição indicada pelo indice passado.
   */
  public void toAddMethodFour(String element, int index) throws Exception {
    if (this.elements[index] != null) {
      throw new IllegalArgumentException("Index já preenchido!");
    }
    this.elements[index] = element;
  }

  /**
   * Declarando método que recebe um elemento e um indice inteiro como argumento, adicionando esse elemento na
   * posição indicada pelo inteiro passado.
   */
  public void toAddMethodFive(String element, int index) throws IllegalArgumentException {
//    Verificando se o indice passado é valido.
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("Index invalido!");
    }
//    Movendo os elementos uma posição a frente da sua atual até que seja possivel a inserção do novo elemento.
    for (int i = this.size - 1; i >= index; i--) {
      this.elements[i + 1] = this.elements[i];
    }
//    Inserindo o novo elemento na posição passada.
    this.elements[index] = element;
//    Incrementando o size em mais um (+1).
    this.size++;
  }

  /**
   * Declarando método privado que se o {@code this.size} for igual a {@code this.elements.length}, cria um novo
   * vetor de tamanho maior e com os mesmos elementos do vetor original.
   * <p>
   * Sendo esse método utilizado apenas internamente a classe {@code vector}.
   */
  private void resize() {
    if (this.size == this.elements.length) {
      String[] newElements = new String[this.elements.length * 2 + 1];
      System.arraycopy(this.elements, 0, newElements, 0, this.size);
      this.elements = newElements;
    }
  }

  /**
   * Declarando método que redimenciona o array a medida que novos elementos vão sendo adicinados.
   */
  public void toAddMethodSix(String element, int index) throws Exception {
    this.resize();
    if (this.elements[index] != null) {
      throw new IllegalArgumentException("Index já preenchido!");
    }
    this.elements[index] = element;
    this.size++;
  }

  /**
   * Declarando método que remove um elemento com base no index passado e reorganiza o array.
   */
  public void removeElement(int index) throws IllegalArgumentException {
    if (index < 0 && index > this.size) {
      throw new IllegalArgumentException("Index invalido!");
    }

    this.elements[index] = null;
    for (int i = index; i < this.size; i++) {
      this.elements[i] = this.elements[i + 1];
    }
    this.size--;
  }

  /**
   * Sobreescrevendo o método toString fazendo com que ele retorne o array por completo.
   */
  @Override
  public String toString() {
    return Arrays.toString(elements);
  }
}