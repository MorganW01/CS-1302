import javax.swing.*;

public class Background {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Background Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BackgroundPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
