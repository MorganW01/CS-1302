import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class Circle_RubberBand extends JFrame implements MouseListener, MouseMotionListener {

    int x, y, radius;
    boolean mousePressed = false;
    public Circle_RubberBand() {
        super("Circle RubberBand");
        addMouseListener(this);
        addMouseMotionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Circle_RubberBand();
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x - radius, y - radius, radius * 2, radius * 2);
    }
    public void mouseDragged(MouseEvent event) {
        radius = (int) Math.sqrt(Math.pow(event.getX() - x, 2) + Math.pow(event.getY() - y, 2));
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent event) {
        if (!mousePressed) {
            x = event.getX();
            y = event.getY();
            mousePressed = true;
        }
    }
    @Override

    public void mouseReleased(MouseEvent arg0) {
        mousePressed = false;
    }

    public void mouseMoved(MouseEvent arg0) {

    }

    @Override

    public void mouseClicked(MouseEvent arg0) {

    }

    @Override

    public void mouseEntered(MouseEvent arg0) {

    }

    @Override

    public void mouseExited(MouseEvent arg0) {

    }
}
