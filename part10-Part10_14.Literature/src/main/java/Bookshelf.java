
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bookshelf {

	private final List<Book> books;

	public Bookshelf() {
		books = new ArrayList<>();
	}

	public void add(Book book) {
		books.add(book);
	}

	public List<Book> getBooks() {
		return books;
	}

	public Bookshelf sort() {
		Comparator<Book> comparator = Comparator
			.comparing(Book::getAge)
			.thenComparing(Book::getTitle);
		Collections.sort(books, comparator);
		return this;
	}

}
