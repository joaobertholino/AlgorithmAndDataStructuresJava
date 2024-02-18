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
//    Declarando uma variavel option que inicializa em 1.
    int option = 1;
//    Declarando um loop while que executara o metodo getOption, atribuindo
//    seu retorno a variavel option, enquanto option for diferente de 0.
    while (option != 0) {
      option = getOption(scan);
      switch (option) {
        case 1:
//          Chamando o método toAddContactFinal passando como argumento o objeto
//          Scanner e o vetor de contatos.
          toAddContactFinal(scan, contactVector);
          break;
        case 2:

          break;
        default:
          break;
      }
    }
//    Imprimindo mensagem caso o usuario digite 0.
    System.out.println("Usuario digitou zero, programa finalizado!");
  }

  /**
   * Declarando um método que executa o método {@code readInfo} passando como argumento uma mensagem e o objeto
   * {@code Scanner}, objeto esse que sera passado na chamada do método {@code toAddContactFinal}.
   * <p>
   * O retorno do método {@code readInfo} sera armazenado nas variveis de nome: {@code name}, {@code fone}
   * e {@code email}.
   * <p>
   * Logo apos isso, um objeto {@code contact} é instanciado, passando as variaveis ao seu construtor, em seguida,
   * adiconando esse objeto {@code contact} ao vetor utilizando o método {@code toAddMethodThree}
   * da classe {@code VectorGenerics}.
   * <p>
   * Por fim, imprime uma mensagem indicando o sucesso da operação junto ao contato adicionado.
   */
  private static void toAddContactFinal(Scanner scan, VectorGenerics<Contact> contactVector){
    System.out.println("Criando um contato, entre com as informações:");
    String name = readInfoOne("Entre com o nome:", scan);
    String fone = readInfoOne("Entre com o telefone:", scan);
    String email = readInfoOne("Entre com o email:", scan);

    Contact contact = new Contact(name, fone, email);
    contactVector.toAddMethodThree(contact);
    System.out.println("Contato adicionado com sucesso!");
    System.out.println(contact);
  }

//  TODO: https://youtu.be/eUKloM_EUyg?list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi&t=1475
//  TODO: Implementando logica referente a opção 2.
  private static void toAddContactWithPosition(Scanner scan, VectorGenerics<Contact> contactVector){
    System.out.println("Criando um contato, entre com as informações:");
    String name = readInfoOne("Entre com o nome:", scan);
    String fone = readInfoOne("Entre com o telefone:", scan);
    String email = readInfoOne("Entre com o email:", scan);

    Contact contact = new Contact(name, fone, email);
    contactVector.toAddMethodThree(contact);
    System.out.println("Contato adicionado com sucesso!");
    System.out.println(contact);
  }

  /**
   * Declarando método que imprime uma menssagem e captura os dados que o usuario inserir
   * e retona esses dados em {@code String}.
   */
  private static String readInfoOne(String message, Scanner scan){
    System.out.println(message);
    String input = scan.nextLine();
    return input;
  }

  private static int readInfoTwo(String message, Scanner scan){
    System.out.println(message);
    String input = scan.nextLine();
    int parseInput = Integer.parseInt(input);
    return parseInput;
  }

  /**
   * Declarando método que inicializa tres variaveis de nome: {@code inputValid} inicializada com o valor {@code false},
   * {@code input} não inicializada e {@code option} inicilizada com valor {@code 0}.
   * <p>
   * Apos isso, é declarado um loop {@code while} onde sera executado enquanto a variavel {@code inputValid}
   * for {@code false} imprimindo as opções disponiveis para o usuario escolher.
   * <p>
   * Por fim, ainda no bloco {@code while}, é declarado um {@code tryCatch} onde no bloco {@code try} é feita a
   * reatribuição da variavel {@code input} passando o método {@code scan.nextLine}, no qual, {@code scan}, é o
   * parametro do método {@code getOption} que recebera o objeto da classe {@code Scanner} como argumento. Na proxima
   * linha é reatribuida a variavel {@code option} fazendo o {@code parser} de {@code String} para {@code int} do valor
   * da variavel {@code input} utilizando o método da classe Wrapper {@code Integer.parseInt(input)}, onde
   * {@code Integer} é a classe Wrapper e {@code parseInt()} é o método que recebe um valor como argumento e executa
   * essa ação.
   * <p>
   * Ainda no bloco {@code while} no bloco {@code Try} declaramos um {@code if} que será executado caso a variavel
   * {@code option} que armazena a opção escolhida pelo usuario, possua um valor entre >= 0 e <= 11, caso essa condição
   * seja {@code true}, a variavel {@code inputValid} será reatribuida {@code true}, assim parando a execução do loop
   * {@code while} e retornando a variavel {@code option}.
   * <p>
   * Se caso a condição do {@code if} for {@code false}, será executado o bloco {@code else} onde será lançado uma
   * {@code Exception} a qual será capturada pelo bloco {@code catch}, exibindo uma mensagem junto as opções para
   * fazer uma nova escolha.
   */
  private static int getOption(Scanner scan) {
    boolean inputValid = false;
    String input;
    int option = 0;
    while (!inputValid) {
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

      try {
        input = scan.nextLine();
        option = Integer.parseInt(input);
        if (option >= 0 && option <= 11) {
          inputValid = true;
        } else {
          throw new Exception();
        }
      } catch (Exception e) {
        System.out.println("Entrada invalida, digite novamente!");
      }
    }
    return option;
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
      contact.setFone(STR."11111111\{i}");
      contactVector.toAddMethodSix(contact, i);
    }
  }
}
