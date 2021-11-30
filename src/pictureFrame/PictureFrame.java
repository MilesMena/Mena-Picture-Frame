package pictureFrame;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * A JFrame descedant, it is 290 pixels wide and 400 tall, and is the frame for the picture.
 * @author menam
 *
 */
public class PictureFrame extends JFrame {
	/**
	 * make all the borders, buttons, labels,formatting
	 */
	public void setUpGUI() {
		setTitle("Picture Frame");
		setBounds(100,100,290,400);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		// tarStory = new JTextArea();
		//c.add(BorderLayout.CENTER);
		// the south panel has a btnPrev, btnSave,btnNext
		JPanel panSouth = new JPanel();
		JPanel panCenter = new JPanel();
		JPanel panNorth = new JPanel();
		panSouth.setLayout(new FlowLayout());
		JButton btnPrev = new JButton("Prev");
		panSouth.add(btnPrev);
		JButton btnSave = new JButton("Save");
		panSouth.add(btnSave);
		JButton btnNext = new JButton("Next");
		panSouth.add(btnNext);
		c.add(panSouth,BorderLayout.SOUTH);
	}
	/**
	 * call setUpGUI to create the picture frame
	 */
public PictureFrame() {
	setUpGUI();
}
}
