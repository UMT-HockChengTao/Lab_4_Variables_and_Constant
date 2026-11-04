package circlecalculation;

/******************************************
 * Author: Hock Cheng Tao
 * Program Name: CircleCalculaion.java
 * *Description: To manipulate measurement of circle using correct variables
 * Date: 4 November 2026
 * Modified Date: None
 * Version: 1.0
 ******************************************/
import javax.swing.JOptionPane;
public class CircleCalculation {

    public static void main(String[] args) {
        double PI = 3.14159; //global constant of PI value
        
        String radiusInput = JOptionPane.showInputDialog("Enter the radius of the circle (cm)"); //Prompt user to input radius
        
        if (radiusInput == null)
            return;
        
        double radius = Double.parseDouble(radiusInput); //Convert input into double
        
        if (radius < 0){
            JOptionPane.showMessageDialog(null, "Radius cannot be less than zero ");
            return; //Reject the value if radius is negative
        }
        
        double diameter = 2 * radius; //Calculate diameter
        double circumference = 2 * PI * radius; //Calculate circumference
        double area = PI * radius * radius; //Calculate area
        
        String message = String.format("Diameter of the circle = %.2f cm \nCircumference of the circle = %.2f cm "
                + "\nArea of the circle = %.2f cm^2", diameter, circumference, area);
        
        JOptionPane.showMessageDialog(null, message); //Display output
    }
    
}
