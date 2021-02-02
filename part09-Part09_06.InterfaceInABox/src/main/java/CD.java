
public class CD implements Packable {

	private final String artist;
	private final String title;
	private final int year;
	private final double weight;

	public CD(String artist, String title, int year) {
		this.artist = artist;
		this.title = title;
		this.year = year;
		this.weight = 0.1;
	}

	@Override
	public double weight() {
		return weight;
	}

	@Override
	public String toString() {
		return artist + ": " + title + " (" + year + ")";
	}

}
