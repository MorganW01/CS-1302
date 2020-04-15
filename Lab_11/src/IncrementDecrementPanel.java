import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class IncrementDecrementPanel extends JPanel {
    private JButton increment, decrement;
    private JLabel label;
    private JPanel buttonPanel;

    public IncrementDecrementPanel() {
        int number = 50;
        increment = new JButton("Inc."); //reason for shorthand: the word "increment" was too big and caused the second button to be non-visible
        decrement = new JButton("Dec.");
        ButtonListener listener = new ButtonListener();
        increment.addActionListener(listener);
        decrement.addActionListener(listener);
        label = new JLabel("value = " + number);
        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(200, 40));
        buttonPanel.setBackground(Color.blue);
        buttonPanel.add(increment);
        buttonPanel.add(decrement);
        setPreferredSize(new Dimension(200, 80));
        setBackground(Color.cyan);
        add(label);
        add(buttonPanel);
    }
    private class ButtonListener implements ActionListener{
        int number = 50;

        public void actionPerformed(ActionEvent event){
            if (event.getSource() == increment) {
                number++;
                label.setText("value = " + (number));
            }
            else{
                number--;
                label.setText("value = " + (number));}
        }
    }
}
