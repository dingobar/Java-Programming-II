
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Divisible {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(-17);
		numbers.add(-5);
		numbers.add(7);
		
		ArrayList<Integer> divisible = divisible(numbers);
		
		divisible.stream()
			.forEach(luku -> System.out.println(luku));
	}
	
	public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
		ArrayList<Integer> divs = new ArrayList<>(Arrays.asList(2, 3, 5));
		return numbers.stream()
			.filter(i -> divs.stream().anyMatch(k -> i % k == 0))
			.collect(Collectors.toCollection(ArrayList::new));
	}
	
}
