package pictureFrame;
import java.util.ArrayList;





public class App {

	public static void main(String[] args) {
		ArrayList<PictureData> pictureData = new ArrayList<PictureData>();
		String fname = "descriptions.txt";
		pictureData = PictureDataReader.readPictureDataFromFile(fname);
		PictureLoader.loadImagesFrom

	}

}
