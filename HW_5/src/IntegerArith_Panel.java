import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IntegerArith_Panel extends JPanel {
    private JTextField number1;
    private JTextField number2;
    private JButton display;

    private JLabel number2Label, number1Label, displayLabel;

    public IntegerArith_Panel(){


        number1Label = new JLabel("first number: ");
        number2Label= new JLabel("second number: ");
        displayLabel = new JLabel("display");

        add(number1Label);
        add(number2Label);
        add(displayLabel);

        setPreferredSize();


    }





}
