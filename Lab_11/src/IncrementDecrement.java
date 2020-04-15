import javax.swing.JFrame;
public class IncrementDecrement{
    public static void main(String[] args){
        JFrame frame = new JFrame("IncrementDecrement");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new IncrementDecrementPanel());
        frame.pack();
        frame.setVisible(true);
    }
}

