import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

//note: hover over the left side = red, hover over the right side = green
public class BackgroundPanel extends JPanel {
    private int xValue;
    public BackgroundPanel() {
        LocationListener listener = new LocationListener();
        addMouseMotionListener(listener);
        setPreferredSize(new Dimension(200, 200));
        setBackground(Color.red);

    }
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        Color setColor;
        if (xValue < (getWidth()*0.5)){
            setColor=Color.red;
        }
        else {
            setColor=Color.green;
        }
        setBackground(setColor);
    }

    private class LocationListener implements MouseMotionListener {
        public void mouseMoved(MouseEvent e) {
            xValue = e.getX();
            repaint();
        }

        public void mouseDragged(MouseEvent e) {
        }
    }
}
