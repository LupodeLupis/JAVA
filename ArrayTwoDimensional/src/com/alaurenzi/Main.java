package com.alaurenzi;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            // Create a Scanner
            Scanner input = new Scanner(System.in);

            int [][] arrayDim =  {{1,2,3,5,6,8,9},
                                  {3,5,6,9}} ;
            System.out.print(arrayDim.length);    // 2
            System.out.print(arrayDim[0].length); // 7
            System.out.print(arrayDim[1].length); // 4*/





            // Enter array values
            int[][] m = new int[3][4]; // [3] = rows [4] = column
            System.out.println("Enter " + m.length + " rows and "
                    + m[0].length + " columns: ");  /*
                                                         0 1 2 3  index
                                                       0 1 2 3 4  m[0].length = 4
                                                       1 4 5 6 7  m[1].length = 4
                                                       2 8 1 2 3  m[2].length = 4

                                                       i
                                                       n
                                                       d  m.length = 3
                                                       e
                                                       x*/
            for (int i = 0; i < m.length; i++)
                for (int j = 0; j < m[i].length; j++)
                    m[i][j] = input.nextInt();

            // Display result
            System.out.println("\nSum of all elements is " + sum(m));
        }

        public static int sum(int[][] m) {
            int total = 0;
            for (int row = 0; row < m.length; row++) {
                for (int column = 0; column < m[row].length; column++) {
                    total += m[row][column];
                }
            }

            return total;
        }

}
