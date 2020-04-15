import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IntegerArith_Panel extends JPanel {
    private JTextField number1, number2;
    private JButton display;
    private JLabel sumText, productText, label1, label2, sumOutput, productOutput;

    public IntegerArith_Panel() {

        label1 = new JLabel("Enter first number: ");
        label2 = new JLabel("Enter second number: ");
        display = new JButton("Display");
        sumText = new JLabel("Sum = ");
        productText = new JLabel("Product = ");
        sumOutput = new JLabel("---");
        productOutput = new JLabel("---");
        number1 = new JTextField(5);
        number1.addActionListener(new ButtonListener());
        number2 = new JTextField(5);
        number2.addActionListener(new ButtonListener());
        add(label1);
        add(number1);
        add(label2);
        add(number2);
        add(display);
        add(sumText);
        add(sumOutput);
        add(productText);
        add(productOutput);

        setPreferredSize(new Dimension(300, 40));
        setBackground(Color.orange);
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int num1, num2;
            String text1 = number1.getText();
            String text2 = number2.getText();
            num1 = Integer.parseInt(text1);
            num2 = Integer.parseInt(text2);
            sumOutput.setText(Integer.toString(num1 + num2));
            productOutput.setText(Integer.toString(num1 * num2));


        }
    }
}
