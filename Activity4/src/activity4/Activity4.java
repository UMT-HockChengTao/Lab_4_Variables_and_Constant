/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity4;

/***************************************
 *Author: Hock Cheng Tao
 *Program name: Activity4.java
 *Description:  To convert the characters from uppercase to lowercase and vice versa
 *Date: 4 November 2026
 *Modified Date: None
 *Version: 1.0
 ***************************************/
import javax.swing.JOptionPane;
public class Activity4 {
    public static void main(String[] args){
        //Input string
        String message = JOptionPane.showInputDialog("Enter the string: ");
        
        
        JOptionPane.showMessageDialog(null,"The word that has been entered: " + message +
                "\nThe amount of word :" + message.length()+
                "\nThe word in lowercase :" + message.toLowerCase() +
                "\nThe word in uppercase :" + message.toUpperCase());
    }
}

