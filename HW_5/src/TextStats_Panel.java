import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextStats_Panel extends JPanel implements ActionListener {

    private JScrollPane scroll;
    private JButton compute;
    private JLabel stats;
    private JTextArea textArea;

    public TextStats_Panel(){

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        compute = new JButton("compute");
        compute.addActionListener(this);
        JPanel statPane = new JPanel();
        statPane.setBorder(BorderFactory.createTitledBorder("Text Statistics"));
        statPane.setOpaque(false);
        stats = new JLabel ("Number of words: 0");
        statPane.add(stats);
        statPane.add(compute);
        scroll = new JScrollPane(textArea);
        scroll.setPreferredSize(new Dimension(400,400));
        scroll.setBorder(BorderFactory.createTitledBorder("Enter text here: "));
        add(scroll);
        add(statPane);
        setPreferredSize(new Dimension(500,600));


    }
    private void updateStats(){

        String text = textArea.getText().trim();
        String []words =text.split("\\s+");
        stats.setText("Number of words: "+words.length);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object source = actionEvent.getSource();
        if (source == compute){
            updateStats();
        }

    }
}
