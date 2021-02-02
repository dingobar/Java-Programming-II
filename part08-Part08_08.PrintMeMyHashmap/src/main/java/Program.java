
import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		// Test your program here!
	}

	public static void printKeys(HashMap<String, String> hashmap) {
		hashmap.keySet()
			.forEach(System.out::println);
	}

	public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
		hashmap.keySet()
			.stream()
			.filter((i) -> i.contains(text))
			.forEach(System.out::println);
	}

	public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
		hashmap.entrySet()
			.stream()
			.filter((i) -> i.getKey().contains(text))
			.map((i) -> i.getValue())
			.forEach(System.out::println);
	}
}
