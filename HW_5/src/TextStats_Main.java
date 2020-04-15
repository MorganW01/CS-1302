import javax.swing.*;

public class TextStats_Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Statistics Question 5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TextStats_Panel panel = new TextStats_Panel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }



}
