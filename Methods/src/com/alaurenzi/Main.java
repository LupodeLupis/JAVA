package com.alaurenzi;



public class Main {

    public static void main(String[] args) {

        /* just a test!!
        int valueMod = 9806;
        int newValMod = valueMod % 1000;
        double anotherNevValMod = (double)newValMod / 10;
        System.out.println("The muduls value is " + newValMod + " " + anotherNevValMod);

        // coping an Array with a FOR LOOP
        int mySourceArray [] = { 2, 8, 6, 9, 15};
        int [] myTargetArray = new int [mySourceArray.length];

        for ( int i = 4; i >= 0; i--){

            myTargetArray[i] = mySourceArray[i];

            System.out.println("My Array conntains : " + myTargetArray[i]);
        }

        // coping an Array with System.arraycopy(SourceArray, pos, TargetArrat, pos, lenght) method

        System.arraycopy(mySourceArray,3    ,myTargetArray, 3, 1);

        System.out.println("The Target array at index [4] " + myTargetArray[3]);
        */


        int higScorePosition   = calculateHighScorePosition(1500);
        displayHighScorePosition( "Alberto",higScorePosition);
        higScorePosition   = calculateHighScorePosition(900);
        displayHighScorePosition( "Cintia", higScorePosition);
        higScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition( "Marco", higScorePosition);
        higScorePosition  = calculateHighScorePosition(50);
        displayHighScorePosition( "Luca", higScorePosition);
        higScorePosition   = calculateHighScorePosition(1000);
        displayHighScorePosition( "Alberto",higScorePosition);


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 4000;
        int highScore = calculateScore ( gameOver, score , levelCompleted, bonus);  // passing arguments with the name of variables previously declared
        //calculateScore(true, 800, 5, 4000);  passing arguments without declaring variables previously
        System.out.println("Your final score is " + highScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 8000;

       calculateScore( gameOver, score , levelCompleted, bonus);
        //calculateScore(true,10000,8, 8000);

    }

    public static int /*void*/ calculateScore (boolean  gameOver , int score, int levelCompleted, int bonus){


        // Code Block: the variable inside the code block are able to access variable declared outside the code block (global)
        if (gameOver == true){
            int totScore = score + ( levelCompleted * bonus);
            totScore =+ 1000;
            return totScore;

        } else {

            System.out.println(" The return type is -1");
            return -1;

        }
    }
    /*Challange

             1. create a method called displayHighScorePosition, it should receive a player's name
             name as parameter and a second parameter should be defined as a position in the highScore table,

                1a.  display the player's name, along with the message, 'player's name managed to get in position...'
                     and then display the number they receive, the position number. Then a further message on the highScore table,

             2.create a second method called calculateHighScorePosition, it should be sent one argument only.
               In other words only have one parameter which is the player's score, it should return an int.
               And the return data should be
               '1 if the score is >1000'
               '2 if the score is >500 and <1000',
               '3 if the score is >100 and <500'
               and in all other circumstances return '4'.

             3. So you need to call both methods and display the results.
    */
    public static void displayHighScorePosition ( String namePlayer, int position ){

        System.out.println( namePlayer + " managed to get into the postion " + position + " on the high score table");
    }

    public static int calculateHighScorePosition( int score){

        if ( score >= 1000)
            return 1;
            else if (score >= 500 && score  < 1000 )
                return 2;
            else if (score >= 100 && score < 500)
                return 3;
                else
                    return 4;
    }
}

/*
 // THE METHOD OVERLOADING CHANGING THE RETURN TYPE IN JAVA DOES NOT WORK BECAUSE IT CREATES AMBIGUITY
class Adder{
    static int add(int a,int b){return a+b;}
    static double add(int a,int b){return a+b;}
}
class TestOverloading3{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));//ambiguity
    }}

 */

/* Overload the main method
  1.Only possible when main has an array of  Strings as arguments


class Main{

    public static void main (String [] args){
        System.out.println("Main with String [] args ");
    }

    public static void main (String args){
        System.out.println("Main witr Strings args");
    }

    public static void main () {
        System.out.println("Main with () args");
    }

}
*/