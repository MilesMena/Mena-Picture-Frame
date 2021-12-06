package pictureFrame;
import java.util.ArrayList;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
/**
 * Overwrites data to text file names "descriptions.txt
 * @author menam
 *
 */
public class PictureDataWriter {
 	public static void writeToFile(ArrayList<PictureData> pd) {
 		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("descriptions.txt")));
			for (PictureData picData: pd) {
				pw.println(picData);
			}
			pw.close();
		} catch (Exception ex) {
		}
	}
 	}


