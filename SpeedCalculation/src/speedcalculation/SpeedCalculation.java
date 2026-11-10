package speedcalculation;

/******************************************
 * Author: Hock Cheng Tao
 * Program Name: SpeedCalculaion.java
 * *Description: To calculate speed using correct variables
 * Date: 4 November 2026
 * Modified Date: None
 * Version: 1.0
 ******************************************/
import javax.swing.JOptionPane;
public class SpeedCalculation {
    
    public static void main(String[] args) {
        //input distance
        String meterDistanceInput = JOptionPane.showInputDialog("Enter the distance in meter: ");
        double meterDistance = Double.parseDouble(meterDistanceInput);
        
        //input time in hours, minutes and second from user
        String hourInput = JOptionPane.showInputDialog("Enter time in hour: ");
        double hour = Double.parseDouble(hourInput);
        String minuteInput = JOptionPane.showInputDialog("Enter time in minutes: ");
        double minute = Double.parseDouble(minuteInput);
        String secondInput = JOptionPane.showInputDialog("Enter time in second: ");
        double second = Double.parseDouble(secondInput);
        
        //Calculate total second
        double totalSecond = hour * 3600 + minute * 60 + second;
        
        //Calculate speed in different unit
        double meterPerSec = meterDistance / totalSecond;
        
        double kilometerPerHour = (meterDistance / 1000) / (totalSecond / 3600);
        
        double milesPerHour = kilometerPerHour * 1000 / 1609; 
        
        String message = String.format("Speed\n Meter per Second: %.2f\n Kilometer per Hour: %.2f\n"
                + " Miles per Hour: %.2f\n", meterPerSec, kilometerPerHour, milesPerHour);
        
        JOptionPane.showMessageDialog(null, message);
    }
    
}
