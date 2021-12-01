package pictureFrame;
import java.util.ArrayList;


import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
/**
 * Contains the function loadImagesFromPictureData, which reads images from a pictures data and returns an arraylist of Buffered Images
 * @author menam
 *
 */
public class PictureLoader {
public static ArrayList<BufferedImage> loadImagesFromPictureData(ArrayList<PictureData> pictureData){
	ArrayList<BufferedImage> bfImage = new ArrayList<BufferedImage>();
	for (PictureData pd: pictureData) {
		try {
		BufferedImage image = ImageIO.read(new File(pd.getName()));
		bfImage.add(image);
		} catch (Exception ex) {
			System.out.println("The image could not be read.");
			
		}
		
	}

	
			
			
	return bfImage;
}
}
