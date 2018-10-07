package com.alaurenzi;

public class Main {

    public static void main(String[] args) {
	  String myString = "This is a string!!";
	  System.out.println(" My string is equal to:" + myString);
	  myString = myString + " and this much more";
	  myString = myString + " \u00AE 2018 ";
	  System.out.println(" My string is equal to:" + myString);

	  String myStringNum = "2569.1";
	  String myNewStringNum = "65";
	  System.out.println(" My string is equal to:" + myNewStringNum + myStringNum);

	  String lastString = "10";
	  int myInt = 50 + 1;
	  System.out.println(" My string is equal to:" + lastString + myInt);
	  double doubleNumber = 12.36;
	  lastString = lastString + doubleNumber + myInt;
	  System.out.println(" My string is equal to:" + lastString);




    }
}
