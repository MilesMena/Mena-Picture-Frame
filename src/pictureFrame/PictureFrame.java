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
import java.awt.Graphics;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
/**
 * A JFrame descedant, it is 290 pixels wide and 400 tall, and is the frame for the picture.
 * @author menam
 *
 */
public class PictureFrame extends JFrame{
	private JTextField  dateText;
	private JTextArea descriptionText;
	public void setUpMainMenu(){
		JMenuBar mbar = new JMenuBar();
		JMenu mnuFile = new JMenu("File");
		JMenu mnuHelp = new JMenu("Help");
		mbar.add(mnuFile);
		mbar.add(mnuHelp);
		JMenuItem miSave = new JMenuItem("Save");
		JMenuItem miExit = new JMenuItem("Exit");
		JMenuItem miAbout = new JMenuItem("About");
		mnuHelp.add(miAbout);
		mnuFile.add(miSave);
		mnuFile.add(miExit);
		miExit.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				}
		);
		miAbout.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null,"Created by Miles Mena");
					}
				}
				
				
				);
		
		setJMenuBar(mbar);
	
	}
	
	/**
	 * make all the borders, buttons, labels,formatting
	 */
	public void setUpGUI() {
		setTitle("Picture Frame");
		setBounds(100,100,290,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setUpMainMenu();
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		dateText = new JTextField();
		descriptionText = new JTextArea();
		// tarStory = new JTextArea();
		//c.add(BorderLayout.CENTER);
		// the south panel has a btnPrev, btnSave,btnNext
		// the center panel uses borderlayout
		// the north panel uses jtextfield for holding date
		JPanel panSouth = new JPanel();
		JPanel panCenter = new JPanel();
		JPanel panNorth = new JPanel();
		// north panel
		panNorth.add(dateText);
		panCenter.add(descriptionText);
		// south panel
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
