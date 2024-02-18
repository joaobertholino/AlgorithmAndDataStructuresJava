package com.joaobertholino.stacks.stack;

import java.util.Arrays;

/**
 * A estrutura de dados {@code pilha} é uma forma de armazenar dados de forma linear, semelhante aos vetores.
 * Sendo todas as operações de manipulação realizadas ao final da pilha, seguindo o principio de {@code LIFO}.
 * <p>
 * LIFO: Last in First out: Sempre o ultimo a entrar é o primeiro a sair.
 */
public class Stack<T> {
  private final T[] elements;
  private final int size;

  public Stack(int capacity) {
    this.elements = (T[]) new Object[capacity];
    this.size = 0;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return STR."\{Arrays.toString(elements)}, size = \{size}}";
  }
}
