package pictureFrame;
import java.util.ArrayList;

import java.awt.image.BufferedImage;




/**
 * The main class that calls the other classes.
 * @author menam
 *
 */
public class App {

	public static void main(String[] args) {
		ArrayList<PictureData> pictureData = new ArrayList<PictureData>();
		String fname = "descriptions.txt";
		pictureData = PictureDataReader.readPictureDataFromFile(fname);
		ArrayList<BufferedImage> bfImages = PictureLoader.loadImagesFromPictureData(pictureData);
		PictureFrame pf = new PictureFrame(bfImages,pictureData);
		pf.setVisible(true);
	}

}
