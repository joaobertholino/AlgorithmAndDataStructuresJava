package com.joaobertholino.vectorsandarrays.exercises.contactex.test;

import com.joaobertholino.vectorsandarrays.exercises.contactex.vector.Contact;
import com.joaobertholino.vectorsandarrays.vector.VectorGenerics;

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
//    Instanciando a classe Scanner para leitura de dados do usuario.
    Scanner scan = new Scanner(System.in);
//    Instanciando um vetor de contatos com compacidade de 20.
    VectorGenerics<Contact> contactVector = new VectorGenerics<>(20);
//    Chamando o método createContact.
    createContact(5, contactVector);
  }

  /*
TODO:
 Declarando método que, por meio de um loop while, imprime as descrições das opções a serem escolhidas e executa
 o método nextLine da classe Scanner para capturar a opção escolhida pelo usuario como String e fazendo um parse
 para int utilizando o método da classe Wrapper Integer.parseInt, o parser é feito pelo fato do método estar esperando
 um int como retorno.
 Continuar a partir daqui:
 https://youtu.be/eUKloM_EUyg?list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi&t=879
*/
  private static int getOption(Scanner scan){
    boolean inputValid = false;
    while (!inputValid){
      System.out.println("Digite a opção desejada:");
      System.out.println("1: Adicionar contato ao final do vetor.");
      System.out.println("2: Adicionar contato em uma posição especifica do vetor.");
      System.out.println("3: Consultar contato de uma posição especifica do vetor.");
      System.out.println("4: Consultar contato.");
      System.out.println("5: Consultar ultimo indice do contato.");
      System.out.println("6: Verificar se um contato existe.");
      System.out.println("7: Remover contato de uma posição especifica do vetor.");
      System.out.println("8: Remover contato.");
      System.out.println("9: Verificar tamanho do vetor.");
      System.out.println("10: Remover todos os contatos do vetor.");
      System.out.println("11: Imprimir vetor.");
      System.out.println("0: Sair.");

      String input = scan.nextLine();
      int option = Integer.parseInt(input);
    }
    return 0;
  }

  /**
   * Declarando um método que será responsavel por instanciar os contatos da classe {@code Contact}, por meio de um
   * loop que inicia em 1 até {@code amount}, irá atribuir os valores as suas propriedades utilizando {@code setters}
   * e inserir-los no vetor utilizando o método {@code toAddMethodSix}.
   */
  private static void createContact(int amount, VectorGenerics<Contact> contactVector) throws Exception {
    Contact contact;
    for (int i = 1; i <= amount; i++) {
      contact = new Contact();
      contact.setName(STR."Contact \{i}");
      contact.setEmail(STR."email\{i}@email.com");
      contact.setNumber(STR."11111111\{i}");
      contactVector.toAddMethodSix(contact, i);
    }
  }
}
