package pictureFrame;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
public class PicturePanel extends JPanel{
	private BufferedImage picture = new BufferedImage(0,0,0);
	public void setPicture(BufferedImage pic) {
		picture = pic;
		repaint();
	}

	
	
}
