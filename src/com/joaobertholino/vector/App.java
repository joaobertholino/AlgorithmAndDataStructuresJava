package com.joaobertholino.vector;

// TODO: Continuar da aula 9 => https://youtu.be/_nZvr7-njEU?list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi
public class App {
  public static void main(String[] args) throws Exception {
    Vector myPrimaryVector = new Vector(2);
    myPrimaryVector.toAddMethodOne("Elemento um!");
    myPrimaryVector.toAddMethodOne("Elemento dois!");
    myPrimaryVector.toAddMethodOne("Elemento tres!");

    Vector mySecondaryVector = new Vector(2);
    mySecondaryVector.toAddMethodTwo("Elemento um!");
    mySecondaryVector.toAddMethodTwo("Elemento dois!");

    Vector myTertiaryVector = new Vector(2);
    myTertiaryVector.toAddMethodThree("Elemento um!");
    myTertiaryVector.toAddMethodThree("Elemento dois!");
    myTertiaryVector.toAddMethodThree("Elemento tres!");

    Vector myQuaternaryVector = new Vector(2);
    myQuaternaryVector.toAddMethodFour("Elemento um", 0);
    myQuaternaryVector.toAddMethodFour("Elemento dois", 1);

    Vector myQuinaryVector = new Vector(10);
    myQuinaryVector.toAddMethodThree("B");
    myQuinaryVector.toAddMethodThree("C");
    myQuinaryVector.toAddMethodThree("D");
    myQuinaryVector.toAddMethodThree("E");
    myQuinaryVector.toAddMethodThree("F");
    myQuinaryVector.toAddMethodFive("A", 0);

    Vector mySixthVector = new Vector(2);
    mySixthVector.toAddMethodSix("Elemento um!", 0);
    mySixthVector.toAddMethodSix("Elemento dois!", 1);
    mySixthVector.toAddMethodSix("Elemento tres!", 2);

    Vector mySeventhVector = new Vector(2);
    mySeventhVector.toAddMethodSix("Elemento um!", 0);
    mySeventhVector.toAddMethodSix("Elemento dois!", 1);
    mySeventhVector.toAddMethodSix("Elemento tres!", 2);
    mySeventhVector.toAddMethodSix("Elemento quatro!", 3);
    System.out.println(mySeventhVector.toString());
    mySeventhVector.removeElement(1);
    System.out.println(mySeventhVector.toString());
  }
}