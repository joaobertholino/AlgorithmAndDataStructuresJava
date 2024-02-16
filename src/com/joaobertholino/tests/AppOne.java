package com.joaobertholino.tests;

// TODO: https://youtu.be/8gAyHJKugGw?list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi

import com.joaobertholino.vector.Vector;
import com.joaobertholino.vector.VectorGenerics;
import com.joaobertholino.vector.VectorObject;

public class AppOne {
  public static void main(String[] args) throws Exception {
//    Class Vector
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
    final int search = mySeventhVector.contains("Elemento dois!");
    mySeventhVector.removeElement(search);

//    Class VectorObject
    VectorObject myPrimaryVectorObject = new VectorObject(3);
    myPrimaryVectorObject.toAddMethodSix("Elemento um!", 0);
    myPrimaryVectorObject.toAddMethodSix("Elemento dois!", 1);

    VectorObject mySecondaryVectorObject = new VectorObject(3);
    mySecondaryVectorObject.toAddMethodSix(21, 0);
    mySecondaryVectorObject.toAddMethodSix(17, 1);

//    Class VectorGenerics
    VectorGenerics<String> myPrimaryVectorGenerics = new VectorGenerics<>(3);
    myPrimaryVectorGenerics.toAddMethodSix("Elemento um!", 0);
    myPrimaryVectorGenerics.toAddMethodSix("Elemento dois!", 1);

    VectorGenerics<Integer> mySecondaryVectorGenerics = new VectorGenerics<>(3, int.class);
    mySecondaryVectorGenerics.toAddMethodSix(21, 0);
    mySecondaryVectorGenerics.toAddMethodSix(17, 1);
  }
}