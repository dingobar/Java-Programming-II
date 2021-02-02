
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LotteryRow {

	private final ArrayList<Integer> numbers;
	private final Random random;

	public LotteryRow() {
		this.random = new Random();

		this.numbers = new ArrayList<>();
		this.randomizeNumbers();
	}

	public ArrayList<Integer> numbers() {
		return this.numbers;
	}

	public final void randomizeNumbers() {
		numbers.clear();
		ArrayList<Integer> possibleNumbers = (ArrayList) IntStream.range(1, 41)
			.boxed()
			.collect(Collectors.toList());
		IntStream.range(0, 7).forEach(n -> numbers.add(possibleNumbers.remove(random.nextInt(possibleNumbers.size()))));
	}

	public boolean containsNumber(int number) {
		// Check here whether the number is among the drawn numbers
		return numbers.contains(number);
	}
}
