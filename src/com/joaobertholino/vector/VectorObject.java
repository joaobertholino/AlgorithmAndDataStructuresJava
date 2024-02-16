package com.joaobertholino.vector;

import java.util.Arrays;

/**
 * Declarando uma classe que instancia um vetor do tipo {@code Object}, sendo possivel a declaração de vetores de
 * qualquer tipo de dado como {@code String}, {@code Integer}, {@code Double} e etc.
 */
public class VectorObject {
  private Object[] elements;
  private int size;

  public VectorObject(int capacity) {
    this.elements = new Object[capacity];
    this.size = 0;
  }

  public void toAddMethodOne(Object element) {
    for (int i = 0; i < this.elements.length; i++) {
      if (this.elements[i] == null) {
        this.elements[i] = element;
        break;
      }
    }
  }

  public void toAddMethodTwo(Object element) throws Exception {
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size++;
    } else {
      throw new Exception("Array sem espaço!");
    }
  }

  public boolean toAddMethodThree(Object element) {
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

  public Object getElement(int index) throws Exception {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("Index invalido!");
    }
    return this.elements[index];
  }

  public int contains(Object element) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  public void toAddMethodFour(Object element, int index) throws Exception {
    if (this.elements[index] != null) {
      throw new IllegalArgumentException("Index já preenchido!");
    }
    this.elements[index] = element;
  }

  public void toAddMethodFive(Object element, int index) throws IllegalArgumentException {
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
      Object[] newElements = new Object[this.elements.length * 2 + 1];
      for (int i = 0; i < this.size; i++) {
        newElements[i] = this.elements[i];
      }
      this.elements = newElements;
    }
  }

  public void toAddMethodSix(Object element, int index) throws Exception {
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
