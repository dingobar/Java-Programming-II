
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// You can test the class here
		HashMap<String, Integer> lol = new HashMap<>();

		lol.add("lol", 1);
		lol.add("foo", -1);
		lol.remove("lol");
		lol.add("haha", 123);
		lol.add("haha", 12312);
		boolean lolol = lol.contains("foo");

		System.out.println(lol);
		System.out.println(lolol);
	}

}
