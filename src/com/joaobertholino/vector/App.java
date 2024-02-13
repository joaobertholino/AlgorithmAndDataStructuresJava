package com.joaobertholino.vector;

// TODO: https://youtu.be/SiIhY6mj2xk?list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi
public class App {
  public static void main(String[] args) throws Exception {
    Vector myPrimaryVector = new Vector(2);
    myPrimaryVector.toAddMethodOne("Elemento um do array!");

    Vector mySecondaryVector = new Vector(2);
    mySecondaryVector.toAddMethodTwo("Elemento uma do array!");
    mySecondaryVector.toAddMethodTwo("Elemento dois do array!");

    Vector myTertiaryVector = new Vector(2);
    myTertiaryVector.toAddMethodThree("Elemento um do array!");
    myTertiaryVector.toAddMethodThree("Elemento dois do array!");
  }
}