package com.joaobertholino.exercises.Vector;

import java.util.Arrays;

public class Vector<T> {
  private T[] element;
  private int size = 0;

  public Vector(int capacity) {
    this.element = (T[]) new Object[capacity];
  }

  public int getSize() {
    return size;
  }

  public void addMethod(T element, int index) throws Exception {
    if (index < 0 && index >= this.size) {
      throw new IllegalArgumentException("Indice invalido!");
    }
    this.size++;
    this.element[index] = element;
    resizeMethod();
  }

  //    Exercicio um => Criar um método que verifica se um determinado elemento existe no array.
  public boolean containsMethod(T element) {
    for (int i = 0; i < this.size; i++) {
      if (this.element[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  //    Exercicio dois => Criar um método que retorna o indice da ultima ocorrencia do elemento passado.
  public int lastIndexMethod(T element) {
    for (int i = this.size - 1; i > 0; i--) {
      if (this.element[i].equals(element)) return i;
    }
    return -1;
  }

  //    Exercicio tres => Criar um método que remove um elemento de uma determinada posição.
  public void removeMethod(int index) throws Exception {
    if (index < 0 || index >= this.size) {
      throw new IllegalArgumentException("Index invalido!");
    }
    this.element[index] = null;
    for (int i = index; i < this.size; i++) {
      this.element[i] = this.element[i + 1];
    }
    this.size--;
  }

  private void resizeMethod() {
    if (this.size == this.element.length) {
      T[] newElements = (T[]) new Object[this.element.length * 2 + 1];
      System.arraycopy(this.element, 0, newElements, 0, this.size);
      this.element = newElements;
    }
  }

  //    Exercicio quatro => Criar um método que retorna o elemento referente ao indice passado como argumento.
  public T getMethod(int index) {
    return this.element[index];
  }

  //    Exercicio cinco => Criar um método que limpa por completo o array.
  public void clearMethod() {
    this.element = (T[]) new Object[0];
    this.size = 0;
  }

  @Override
  public String toString() {
    return STR."Vector{element=\{Arrays.toString(element)}, size=\{size}\{'}'}";
  }
}
