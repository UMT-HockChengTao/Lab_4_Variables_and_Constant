/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity3;

/******************************************
 *Author: Hock Cheng Tao
 *Program Name: Activity3.java
 *Description: To display age from Identification Card number
 *Date: 4 November 2026
 *Version: 1.0
 ******************************************/
import javax.swing.JOptionPane;
public class Activity3 {
    public static void main(String[] args){
        //Get the ic number from user
        String ic = JOptionPane.showInputDialog
        ("Please enter ic number:");
        
        int firstTwo = Integer.parseInt(ic.substring(0,2));
        
        //Display the birth date and age
        if (firstTwo > 26){
        //Calculate age of population older than Millennial
        int age = 2026 - (firstTwo + 1900);
        String message = String.format("Birthday is:" + ic.substring(4,6) + "-" +ic.substring(2,4) +"-19"+ ic.substring(0,2) + "\nAge:" + age);
        JOptionPane.showMessageDialog(null,message);   
        }
        
        else{
        //Calculate age of population younger than or equal to Millennial
        int age = 2026 - (firstTwo + 2000);
        String message = String.format("Birthday is: " + ic.substring(4,6) + "-" +ic.substring(2,4) +"-20"+ ic.substring(0,2) + "\nAge:" + age);
        JOptionPane.showMessageDialog(null,message);

        }
        
    }
}
