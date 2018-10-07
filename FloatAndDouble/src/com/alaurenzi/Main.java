package com.alaurenzi;

public class Main {

    public static void main(String[] args) {
	 int myIntValue = 5;
	 // width of float = 32 (4 bytes)
	 float myFloatValue = 5f / 3f;
	 // width of double = 64 (8 bytes)
	 double myDoubleValue = 5f / 3.00f;
	 System.out.println("The int value is " + myIntValue);
	 System.out.println("The float value is " + myFloatValue);
	 System.out.println("The double value is " + myDoubleValue);

	 // Convert a given number of pounds to kilogram
	 //  1.Create a variable to store the number of pound
	 //	 2.Calculate the number of Kilograms for the number above [pound] and store it in a variable
	 //  3.Print out the result
	 //  NOTE : 1 pound = 0.45359237 Kg

		double myPoundValue = 200d;
		double myKgValue = myPoundValue * 0.45359237d;
		System.out.println("The total kilogram converted are " + myKgValue);
		// result from Google.com 90.7185


    }
}
