package com.joaobertholino.vector;

public class App {
  public static void main(String[] args) throws Exception {
    Vector myPrimaryVector = new Vector(2);
    myPrimaryVector.toAddMethodOne("Elemento um do array!");

    Vector mySecondaryVector = new Vector(2);
    mySecondaryVector.toAddMethodTwo("Elemento um do array!");
    mySecondaryVector.toAddMethodTwo("Elemento dois do array!");

    Vector myTertiaryVector = new Vector(2);
    myTertiaryVector.toAddMethodThree("Elemento um do array!");
//    myTertiaryVector.toAddMethodThree("Elemento dois do array!");

    myTertiaryVector.addElement("teste", 2);
    System.out.println(myTertiaryVector.toString());
  }
}