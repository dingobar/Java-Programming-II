
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		LotteryRow row = new LotteryRow();
		ArrayList<Integer> lotteryNumbers = row.numbers();

		System.out.println("Lottery numbers:");
		for (Integer number : lotteryNumbers) {
			System.out.print(number + " ");
		}
		System.out.println("");

		for (int i = 0; i < 10000; i++) {
			row.randomizeNumbers();
			row.numbers().forEach(n -> {
				System.out.print(n + " ");
			});
			System.out.println("\n");
		}
	}
}
