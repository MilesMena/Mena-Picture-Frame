package pictureFrame;
import java.util.ArrayList;

import java.util.Scanner;
import java.io.File;
/**
 * Reads picture data from a file using the file name which is passed to it when the class is called.
 * @author menam
 *
 */
public class PictureDataReader {
 public static ArrayList<PictureData> readPictureDataFromFile(String fname){
	 // reads the data of the picture from a file.
	 try {
		 ArrayList<PictureData> PictureData = new ArrayList<PictureData>();
		 Scanner fsc = new Scanner(new File(fname));
		 String line, name, date, description;
		 String[] parts;
		 PictureData CurrentPicture = null;
		 while (fsc.hasNextLine()) {
			 line = fsc.nextLine().trim();
			 parts = line.split("\t");
			 name = parts[0];
			 date = parts[1];
			 description = parts[2];
			 CurrentPicture = new PictureData(name, date, description);
			 PictureData.add(CurrentPicture);
		 }
		 
		 return PictureData;
	 } catch (Exception ex) {
		 return null;
	 }
 }
}
