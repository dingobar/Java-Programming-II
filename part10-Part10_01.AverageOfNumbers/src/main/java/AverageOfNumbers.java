
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
// We initialise the scanner and the list into which the input is read
		Scanner scanner = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();

// reading inputs
		while (true) {
			String row = scanner.nextLine();
			if (row.equals("end")) {
				break;
			}

			inputs.add(row);
		}

		double avg = inputs.stream()
			.mapToDouble(Double::valueOf)
			.average()
			.getAsDouble();
		System.out.println("average of the numbers: " + avg);
	}
}
