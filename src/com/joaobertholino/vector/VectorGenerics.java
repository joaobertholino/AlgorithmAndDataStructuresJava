package com.joaobertholino.vector;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Declarando um classe que instancia um vetor cujo o mesmo terá seu tipo dinamicamente inferido por meio do
 * operador {@code Diamond}.
 */
public class VectorGenerics<T> {
  private T[] elements;
  private int size;

  /**
   * Declarando um construtor fazendo o casting de {@code Object} para o tipo generics {@code T}.
   */
  public VectorGenerics(int capacity) {
    this.elements = (T[]) new Object[capacity];
    this.size = 0;
  }

  /**
   * Declarando um construtor utilizando o {@code reflection} passando o tipo do dado como argumento.
   * <p>
   * Sintaxe para o argumento {@code classType} => {@code nameOfType.class}
   */
  public VectorGenerics(int capacity, Class<T> classType) {
    this.elements = (T[]) Array.newInstance(classType, capacity);
    this.size = 0;
  }

  public void toAddMethodOne(T element) {
    for (int i = 0; i < this.elements.length; i++) {
      if (this.elements[i] == null) {
        this.elements[i] = element;
        break;
      }
    }
  }

  public void toAddMethodTwo(T element) throws Exception {
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size++;
    } else {
      throw new Exception("Array sem espaço!");
    }
  }

  public boolean toAddMethodThree(T element) {
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size++;
      return true;
    }
    return false;
  }

  public int getSize() {
    return size;
  }

  public T getElement(int index) throws Exception {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("Index invalido!");
    }
    return this.elements[index];
  }

  public int contains(T element) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  public void toAddMethodFour(T element, int index) throws Exception {
    if (this.elements[index] != null) {
      throw new IllegalArgumentException("Index já preenchido!");
    }
    this.elements[index] = element;
  }

  public void toAddMethodFive(T element, int index) throws IllegalArgumentException {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("Index invalido!");
    }
    for (int i = this.size - 1; i >= index; i--) {
      this.elements[i + 1] = this.elements[i];
    }
    this.elements[index] = element;
    this.size++;
  }

  private void resize() {
    if (this.size == this.elements.length) {
      T[] newElements = (T[]) new Object[this.elements.length * 2 + 1];
      for (int i = 0; i < this.size; i++) {
        newElements[i] = this.elements[i];
      }
      this.elements = newElements;
    }
  }

  public void toAddMethodSix(T element, int index) throws Exception {
    this.resize();
    if (this.elements[index] != null) {
      throw new IllegalArgumentException("Index já preenchido!");
    }
    this.elements[index] = element;
    this.size++;
  }

  public void removeElement(int index) throws IllegalArgumentException {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("Index invalido!");
    }

    this.elements[index] = null;
    for (int i = index; i < this.size; i++) {
      this.elements[i] = this.elements[i + 1];
    }
    this.size--;
  }

  @Override
  public String toString() {
    return Arrays.toString(elements);
  }
}
