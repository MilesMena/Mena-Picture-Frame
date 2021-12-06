package pictureFrame;
import javax.swing.JFrame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
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
	private JTextArea dottedLine;
	private BufferedImage picture;
	private int index;
	
	public int getIndex() {
		return index;
	}
	
	public void setUpMainMenu(){
		JMenuBar mbar = new JMenuBar();
		JMenu mnuFile = new JMenu("File");
		JMenu mnuHelp = new JMenu("Help");
		mbar.add(mnuFile);
		mbar.add(mnuHelp);
		JMenuItem miSave = new JMenuItem("Save");
		miSave.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				}
				
				);
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
	public void setUpGUI(ArrayList<BufferedImage> bfImg, ArrayList<PictureData> pd) {
		setTitle("Picture Frame");
		setBounds(100,100,290,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setUpMainMenu();
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		dateText = new JTextField(pd.get(index).getDate());
		descriptionText = new JTextArea(pd.get(index).getDescription());
		dottedLine = new JTextArea("_____________________________________________________________________________________________");
		// tarStory = new JTextArea();
		//c.add(BorderLayout.CENTER);
		// the south panel has a btnPrev, btnSave,btnNext
		// the center panel uses borderlayout
		// the north panel uses jtextfield for holding date
		PicturePanel panNorth = new PicturePanel(bfImg, pd);
		JPanel panCenter = new JPanel();
		JPanel panSouth = new JPanel();
		
		

		
		panCenter.add(dateText);
		panCenter.add(dottedLine);
		panCenter.add(descriptionText);
		// south panel
		panSouth.setLayout(new FlowLayout());
		
		JButton btnPrev = new JButton("Prev");
		panSouth.add(btnPrev);
		JButton btnSave = new JButton("Save");
		panSouth.add(btnSave);
		JButton btnNext = new JButton("Next");
		panSouth.add(btnNext);
		
		btnPrev.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e){
						if (Math.floorMod(index, 3)== 0) {
							index = index - 1;
							dateText.setText(pd.get(Math.floorMod(index,4)).getDate());
							descriptionText.setText(pd.get(Math.floorMod(index,4)).getDescription());
							panNorth.setPicture(bfImg.get(Math.floorMod(index,4)));
							panNorth.repaint();
						}  else if (Math.floorMod(index, 3)== 1) {
							index = index - 1;
							dateText.setText(pd.get(Math.floorMod(index,4)).getDate());
							descriptionText.setText(pd.get(Math.floorMod(index,4)).getDescription());
							panNorth.setPicture(bfImg.get(Math.floorMod(index,4)));
							
							panNorth.repaint();
						} else if (Math.floorMod(index, 3)== 2) {
							index = index - 1;
							dateText.setText(pd.get(Math.floorMod(index,4)).getDate());
							descriptionText.setText(pd.get(Math.floorMod(index,4)).getDescription());
							panNorth.setPicture(bfImg.get(Math.floorMod(index,4)));
							panNorth.repaint();
						} else {
							dateText.setText(pd.get(Math.floorMod(index,4)).getDate());
							descriptionText.setText(pd.get(Math.floorMod(index,4)).getDescription());
							panNorth.setPicture(bfImg.get(Math.floorMod(index,4)));
							panNorth.repaint();
							index = 0;
							
						}
						}
					}
	
				);
		btnSave.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e){
						pd.get(Math.floorMod(index,4)).setDate(dateText.getText());
						pd.get(Math.floorMod(index,4)).setDescription(descriptionText.getText());
						PictureDataWriter.writeToFile(pd);
					}
				}
				);
		btnNext.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e){
						if (Math.floorMod(index, 3)== 0) {
							index = index + 1;
							dateText.setText(pd.get(Math.floorMod(index,4)).getDate());
							descriptionText.setText(pd.get(Math.floorMod(index,4)).getDescription());
							panNorth.setPicture(bfImg.get(Math.floorMod(index,4)));
							panNorth.repaint();
						}  else if (Math.floorMod(index, 3)== 1) {
							index = index + 1;
							dateText.setText(pd.get(Math.floorMod(index,4)).getDate());
							descriptionText.setText(pd.get(Math.floorMod(index,4)).getDescription());
							panNorth.setPicture(bfImg.get(Math.floorMod(index,4)));
							
							panNorth.repaint();
						} else if (Math.floorMod(index, 3)== 2) {
							index = index + 1;
							dateText.setText(pd.get(Math.floorMod(index,4)).getDate());
							descriptionText.setText(pd.get(Math.floorMod(index,4)).getDescription());
							panNorth.setPicture(bfImg.get(Math.floorMod(index,4)));
							panNorth.repaint();
						} else {
							dateText.setText(pd.get(Math.floorMod(index,4)).getDate());
							descriptionText.setText(pd.get(Math.floorMod(index,4)).getDescription());
							panNorth.setPicture(bfImg.get(Math.floorMod(index,4)));
							panNorth.repaint();
							index = 0;
							
						}
					}
				}
				);
		
		c.add(panNorth, BorderLayout.NORTH);
		c.add(panSouth,BorderLayout.SOUTH);
		c.add(panCenter, BorderLayout.CENTER);
		
	}
	/**
	 * call setUpGUI to create the picture frame
	 */
public PictureFrame(ArrayList<BufferedImage> bfImages, ArrayList<PictureData> pd) {
	index = 0;
	setUpGUI(bfImages,pd);
	
	
}

}
