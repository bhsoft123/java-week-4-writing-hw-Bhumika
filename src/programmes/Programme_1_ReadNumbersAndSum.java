package programmes;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

public class Programme_1_ReadNumbersAndSum {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int number;
        int sum = 0;
        while (i <= 10) {            //while loop to count valid input entries
            System.out.println("Enter number " + i);
            if (sc.hasNextInt()) {      //if loop to calculate sum and displaying invalid entry message
                number = sc.nextInt();
                i++;
                sum = sum + number;
            } else {
                System.out.println("Invalid number");
            }
        }
        sc.close();
        System.out.println(sum);
    }
}