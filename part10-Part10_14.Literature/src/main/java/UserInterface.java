
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class UserInterface {

	private final Scanner scanner;

	public UserInterface(Scanner scanner) {
		this.scanner = scanner;
	}

	public void start() {

		Bookshelf bookshelf = new Bookshelf();

		while (true) {
			System.out.println("Input the name of the book, empty stops: ");
			String title = scanner.nextLine();
			if (title.isEmpty()) {
				break;
			}
			System.out.println("Input the age recommendation: ");
			int age = Integer.valueOf(scanner.nextLine());
			bookshelf.add(new Book(title, age));
		}

		System.out.println(bookshelf.getBooks().size() + " books in total.");

		System.out.println("Books:");

		bookshelf.sort().getBooks().forEach(System.out::println);
	}

}
