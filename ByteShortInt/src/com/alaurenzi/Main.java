package com.alaurenzi;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {

    public static void main(String[] args) {

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        // int has width of 32
        int myMinValue = -2147483648;
        int myMAxValue =  214_748_3647; // this is a "LITERAL" variable. Using _ (underscore) you ca make the variable more readable.

        // byte has a width of 16
        short myShortValue = -32768;  // this variable fit from -32768 to 32767


        // byte has a width of 8
        byte myByteValue= -128; // this variable fit from -128 to 127
        byte myTotalValue = (byte)( myByteValue/2);  /* need to be casted because JAVA when do the math automatically trasform the result to an INTEGER
                                                        BUT WE WANT A BYTE*/
        System.out.println(myTotalValue);

        byte myNewByteValue = 15;
        short myNewShortValue = 10;
        int myNewIntValue = 589;
        long myLongTotalValue = 50000L + 10 * ( myNewByteValue + myNewShortValue + myNewIntValue);
        short myShortTotalValue = (short) (1000 + 10L * (myNewByteValue + myNewIntValue + myNewShortValue));
        System.out.println("The Long Total value is :" + myLongTotalValue);
        System.out.println("The Short Total value is :" + myShortTotalValue);


    }
}
