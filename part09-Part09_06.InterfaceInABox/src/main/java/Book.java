
public class Book implements Packable {

	private final String author;
	private final String title;
	private final double weight;

	public Book(String author, String title, double weight) {
		this.author = author;
		this.title = title;
		this.weight = weight;
	}

	@Override
	public double weight() {
		return weight;
	}

	@Override
	public String toString() {
		return author + ": " + title;
	}

}
