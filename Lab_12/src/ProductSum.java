import javax.swing.*;
public class ProductSum {
    // Design and implement an application that
    // uses dialog boxes to obtain two integer values
    // (one dialog box for each value) and display the sum and product
    // of the values. Use another dialog box to see whether the user wants
    // to process another pair of values.

    public static void main(String[] args) {
        String number1_string,number2_string, product, sum;
        int number1,number2, goAgain;
        do {
            number1_string= JOptionPane.showInputDialog("Enter an integer: ");
            number1 = Integer.parseInt(number1_string);
            number2_string = JOptionPane.showInputDialog("Enter another integer: ");
            number2 = Integer.parseInt(number2_string);
            product = "The product of your integers is: " + (number1 *number2);
            sum = "The sum of your integers is: " + (number1 +number2);
            JOptionPane.showMessageDialog(null, product);
            JOptionPane.showMessageDialog(null, sum);
            goAgain = JOptionPane.showConfirmDialog(null, "Try again?");
        }
        while (goAgain == JOptionPane.YES_OPTION);
    }

}
