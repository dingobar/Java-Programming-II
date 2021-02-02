
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// test your method here
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println(sum(numbers, 1, 8, 0, 100));

	}

	public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
		fromWhere = Integer.max(0, fromWhere);
		toWhere = Integer.min(array.length, toWhere + 1);

		return IntStream.range(fromWhere, toWhere)
			.map(n -> array[n])
			.filter(n -> n <= largest)
			.filter(n -> n >= smallest)
			.sum();

	}
}
