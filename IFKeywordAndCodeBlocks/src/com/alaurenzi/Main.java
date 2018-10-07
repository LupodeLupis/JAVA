package com.alaurenzi;

public class Main {

    public static void main(String[] args) {
	 boolean gameOver = true;
	 int score = 2000;
	 int levelCompleted = 5;
	 int bonus = 1000;
	 int newScore = 10000;
	 int newLevel = 8;
	 int newBonus = 200;

	 if(score < 5000 && score > 1000) {
         System.out.println( "Your score was less than 5000 but greater that 1000");
     } else if (score > 1000){
        System.out.println("Your score was greater than 1000");
        } else {
	     System.out.println("Your score i less than 1000 ");
     }
     // Code Block: the variable inside the code block are able to access variable declared outside the code block (global)
     if (gameOver == true){
         int totScore = score + ( levelCompleted * bonus);
         System.out.println("Your final score is " + totScore);
     }
     // Using the expression gameOver == true IS THE SAME AS the expression gameOver
     if (gameOver){
         int totScore = score + ( levelCompleted * bonus);        // scope
         System.out.println("Your final score is " + totScore);
         int totNewScore = newScore + (newBonus * newLevel);
         System.out.println("Your new final score is " + totNewScore); // scope
        }


            // for loop example
                int[] values = new int[5];
                for (int i = 1; i < 5; i++) {
                    values[i] = i + values[i-1];  //  value [ index - 1 position ( previous position) ] is not (index - 1 )
                    System.out.println( values[i]);
                }
                values[0] = values[1] + values[4];









     /* int finalScore = totScore;
        The variables inside the Code Block are not accessible from outside because once the section of the code hs finished
        the compiler will automatically deleted any variables that have been created in that block

        That is, if you create a variable inside a Code Block you CANNOT access that variable outside of that Code Block.
        You can still access variable that were created before the Code Block inside the Code Block
      */

         // Print out a second score with the following
         // 1. score set to 10,000
        //  2.with the level completed set to eight
        //  3.bonus set to 200.









    }
}
