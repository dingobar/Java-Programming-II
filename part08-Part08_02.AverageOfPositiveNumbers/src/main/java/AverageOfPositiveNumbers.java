
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();

		while (true) {
			String input = scanner.nextLine();
			if (input.equals("0")) {
				break;
			}
			numbers.add(Integer.valueOf(input));
		}
		OptionalDouble avg = averageOfList(numbers);
		if (avg.isPresent()) {
			System.out.println(avg.getAsDouble());
		} else {
			System.out.println("Cannot calculate the average");
		}
	}

	public static OptionalDouble averageOfList(ArrayList<Integer> list) {
		return list.stream()
			.mapToDouble((n) -> (double) n)
			.filter((n) -> n > 0)
			.average();
	}
}
