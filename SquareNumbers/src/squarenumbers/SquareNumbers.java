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
        int integer1 = Input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int integer2 = Input.nextInt();
        
        int square1 = integer1 * integer1;
        int square2 = integer2 * integer2;
        
        int sum = square1 + square2;
        int diff = square1 - square2;
        
        System.out.printf("Square of the first number: ", square1);
        System.out.printf("\nSquare of the second number: ", square2);
        System.out.printf("\nSum of the squares: ", sum);
        System.out.printf("\nDifference of the squares (first number squared minus the second number squared): ", diff);
        
        
        
    }
    
}
