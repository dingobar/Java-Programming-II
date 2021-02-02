
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// toteuta ohjelmasi tänne
		List<String> inputs = new ArrayList<>();

// reading inputs
		while (true) {
			String row = scanner.nextLine();
			if (row.equals("end")) {
				break;
			}

			inputs.add(row);
		}
		//System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

		String choice = scanner.nextLine();
		double avg;

		if (choice.equals("n")) {
			avg = inputs.stream()
				.mapToDouble(Double::valueOf)
				.filter(i -> i <= 0)
				.average()
				.getAsDouble();
		} else {
			avg = inputs.stream()
				.mapToDouble(Double::valueOf)
				.filter(i -> i >= 0)
				.average()
				.getAsDouble();
		}

		System.out.println("Average of the " + (choice.equals("n") ? "negative" : "positive") + " numbers: " + avg);

	}
}
