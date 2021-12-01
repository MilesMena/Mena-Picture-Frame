package pictureFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
public class PicturePanel extends JPanel implements MouseListener, MouseMotionListener{
	private BufferedImage picture;
	private String message;
	private int msgX, msgY;
	public PicturePanel(){
		message = "Welcome to picture panel";
		setPreferredSize(new Dimension(200,200));
		addMouseMotionListener(this);
		addMouseListener(this);
		msgX = 10;
		msgY = 200;	
	}
	public void setPicture(BufferedImage pic) {
		picture = pic;
		repaint();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString(message, msgX, msgY);
	}
	public void mouseClicked(MouseEvent e) {
        message = String.format("Mouse clicked at (%d, %d)", e.getX(),e.getY());
        msgX = e.getX();
        msgY = e.getY();
        repaint();  // calls paintComponent(g);
    }
    public void mousePressed(MouseEvent e) {
        message = String.format("Mouse pressed at (%d, %d)", e.getX(),e.getY());
        repaint();  // calls paintComponent(g);
    }
    public void mouseReleased(MouseEvent e) {
        message = String.format("Mouse released at (%d, %d)", e.getX(),e.getY());
        repaint();  // calls paintComponent(g);
    }
    public void mouseEntered(MouseEvent e) {
        message = String.format("Mouse entered at (%d, %d)", e.getX(),e.getY());
        repaint();  // calls paintComponent(g);
    }
    public void mouseExited(MouseEvent e) {
        message = String.format("Mouse exited at (%d, %d)", e.getX(),e.getY());
        repaint();  // calls paintComponent(g);
    }
    public void mouseMoved(MouseEvent e) {
        message = String.format("Mouse moved at (%d, %d)", e.getX(),e.getY());
        repaint();  // calls paintComponent(g);
    }
    public void mouseDragged(MouseEvent e) {
        message = String.format("Mouse dragged at (%d, %d)", e.getX(),e.getY());
        repaint();  // calls paintComponent(g);
    }

	
	
}
