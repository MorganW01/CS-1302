import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class StyleOptionsPanel extends JPanel implements ChangeListener {
    private JSlider slider = new JSlider(JSlider.HORIZONTAL);
    private JLabel saying;
    private JCheckBox bold, italic;

    public StyleOptionsPanel() {
        saying = new JLabel("Say it with style!");
        saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
        bold = new JCheckBox("Bold");
        bold.setBackground(Color.cyan);
        italic = new JCheckBox("Italic");
        italic.setBackground(Color.cyan);
        StyleListener listener = new StyleListener();
        bold.addItemListener(listener);
        italic.addItemListener(listener);
        add(saying);
        add(bold);
        add(italic);
        add(slider);
        slider.setMaximum(20);
        slider.setMinimum(0);
        slider.setValue(0);
        Hashtable<Integer, JLabel> sliderLabels = new Hashtable<Integer, JLabel>();
        sliderLabels.put(0, new JLabel("0"));
        sliderLabels.put(2, new JLabel("2"));
        sliderLabels.put(4, new JLabel("4"));
        sliderLabels.put(6, new JLabel("6"));
        sliderLabels.put(8, new JLabel("8"));
        sliderLabels.put(10, new JLabel("10"));
        sliderLabels.put(12, new JLabel("12"));
        sliderLabels.put(14, new JLabel("14"));
        sliderLabels.put(16, new JLabel("16"));
        sliderLabels.put(18, new JLabel("18"));
        sliderLabels.put(20, new JLabel("20"));
        slider.setMajorTickSpacing(1);
        slider.setLabelTable(sliderLabels);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 200));
    }

    public void stateChanged(ChangeEvent e) {
        int style = Font.PLAIN;
        if (bold.isSelected())
            style = Font.BOLD;
        if (italic.isSelected())
            style += Font.ITALIC;
        saying.setFont(new Font("Helvetica", style, slider.getValue()));
    }

    private class StyleListener implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
            int style = Font.PLAIN;
            if (bold.isSelected())
                style = Font.BOLD;
            if (italic.isSelected())
                style += Font.ITALIC;
            saying.setFont(new Font("Helvetica", style, 36));
        }
    }
}