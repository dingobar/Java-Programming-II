
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RandomNumberGenerator r = new RandomNumberGenerator();
		int choice;
		while (true) {
			System.out.println("How many numbers should be printed?");
			try {
				choice = Integer.valueOf(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input - try again.");
			}

		}

		IntStream.range(0, choice).forEach(i -> {
			System.out.println(r.generate());
		});
	}

}
