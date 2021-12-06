package pictureFrame;
/**
 * Object that holds the picture data.
 * @author menam
 *
 */
public class PictureData {
	private String name, date, description;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public PictureData() {
		date = "";
		name = "";
		description = "";
	}
	public PictureData(String name, String date, String description) {
		setName(name);
		setDate(date);
		setDescription(description);
	}
	@Override
	public String toString(){
		return String.format(name + "\t" + date + "\t" + description);
		
	}

}
