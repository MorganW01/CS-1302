import javax.swing.*;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
public class Color_Picker extends JFrame{

    /*Design and implement a program that uses a
    JColorChooser object to obtain a color from the user and display that
    color as the background of the primary program window. Use a dialog
    box to determine if the user wants to display another color, and if so,
    redisplay the color chooser.*/

    public static void main (String []args){
        new Color_Picker();
    }

    public Color_Picker(){
        setSize(400,400);
        getContentPane().setBackground(Color.gray);
        setVisible(true);

        String pickAgain = "yes";

        while(pickAgain.equalsIgnoreCase("yes")){
            Color color = JColorChooser.showDialog(this, "Pick a color: ", getContentPane().getBackground());
            getContentPane().setBackground(color);
            pickAgain=JOptionPane.showInputDialog("Would you like to pick again? (yes or no?)");

        }

    }


}
