import javax.swing.*;

public class IntegerArith_Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Question 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        IntegerArith_Panel panel = new IntegerArith_Panel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
