/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity6;

/***************************************
 *Author: Hock Cheng Tao
 *Program name: Activity6.java
 *Description:  To calculate the mean, variance and standard deviation
 *Date: 4 November 2026
 *Modified Date: None
 *Version: 1.0
 **************************************/
import java.util.*;
public class Activity6 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Get x1, x2 and x3 from user
    System.out.print("Enter x1: ");
    double x1 = input.nextDouble();
    
    System.out.print("Enter x2: ");
    double x2 = input.nextDouble();
    
    System.out.print("Enter x3: ");
    double x3 = input.nextDouble();
    
    //Calculate mean
    double mean = (x1 + x2 + x3) / 3;
    
    //Calculate variance
    double var = (Math.pow(x1 - mean, 2) + Math.pow(x2 - mean, 2) +Math.pow(x3 - mean, 2)) / 3;
    
    //Calculate Standard Deviation
    double standardDev = Math.pow(var , 0.5);
    
    System.out.printf("\nMean: %.2f, \nVariance: %.2f, \nStandard deviation: %.2f\n", mean, var, standardDev);
    
    }
    
}
