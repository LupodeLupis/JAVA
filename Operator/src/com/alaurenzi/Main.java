package com.alaurenzi;



public class Main {

    public static void main(String[] args) {
        int result = 2 + 5;
        System.out.println("The result is :" + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;

        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;

        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 5;
        System.out.println(previousResult + " % 5 = "+ result);


        previousResult = result;
        result = result + 1;

        System.out.println("The result is now: " + result);
        result++;
        System.out.println("The result is now: " + result);
        result--;
        System.out.println("The result is now: " + result);

        result+=2;
        System.out.println("The result is now: " + result);
        result*=3;
        System.out.println("The result is now: " + result);
        result-=5;
        System.out.println("The result is now: " + result);
        result /=2;
        System.out.println("The result is now: " + result);

        boolean isAlian = false;
        if (isAlian == false)
            System.out.println("It is not an Alien");

        int topScore = 90;
        if (topScore < 100)
            System.out.println(" You have the top score!!");

        int topNewScore = 110;
        if ( topScore < topNewScore && topNewScore > 100)
            System.out.println("You still have the top score!!");

        if ((topNewScore > topScore) || (topNewScore < 100))
            System.out.println("You still have the top score! You are the best!");

       /* boolean isName = false;
        if (isName = true)  // in this case we use the operator = instead of == and we make the condition TRUE
            System.out.println("This is not supposed to happen!!");*/

        boolean isName = false;
        if (isName == true)  // in this case we use the operator = instead of == and we make the condition TRUE
            System.out.println("This is not supposed to happen!!");

        isName = true;
        boolean wasIsName = isName ? true : false;
        if(wasIsName)
            System.out.println("Is really was his name?");

        // 1. Create a double variable with  the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both number up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the  remaining total (#4) is equal to 20 or less

        double valueOne = 20d;
        double valueTwo = 80d;

        double valueTot = (valueOne + valueTwo) * 25;

        double valRem = valueTot % 40;

        if (valRem <= 20)
            System.out.println("Total over the limit!!");


        System.out.println(valueTot);




    }
}
