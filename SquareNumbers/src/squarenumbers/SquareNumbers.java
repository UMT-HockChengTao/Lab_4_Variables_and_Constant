package squarenumbers;

/******************************************
 * Author: Hock Cheng Tao
 * Program Name: SquareNumbers.java
 * *Description: To manipulate square numbers using correct variables
 * Date: 4 November 2026
 * Modified Date: None
 * Version: 1.0
 ******************************************/

import java.util.*;
public class SquareNumbers {

    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        
        System.out.print("Enter the first integer: ");
        int integer1 = Input.nextInt(); //Prompt user to input the first integer
        
        System.out.print("Enter the second integer: ");
        int integer2 = Input.nextInt();  //Prompt user to input the first integer
        
        int square1 = integer1 * integer1; //Calculate the squares of the inputs
        int square2 = integer2 * integer2;
        
        int sum = square1 + square2; //Calculate the sum of the squared numbers
        int diff = square1 - square2; //Calculate the difference of the squared numbers
        
        System.out.printf("Square of the first number: %d", square1);
        System.out.printf("\nSquare of the second number: %d", square2);
        System.out.printf("\nSum of the squares: %d", sum);
        System.out.printf("\nDifference of the squares (first number squared "
                + "minus the second number squared): %d \n", diff);
        
    }
    
}
