
import java.util.Scanner;

public class LiquidContainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c1 = 0;
		int c2 = 0;
		OUTER:
		while (true) {
			System.out.println("First: " + c1 + "/100\n"
				+ "Second: " + c2 + "/100"
			);
			System.out.print("> ");

			String input = scan.nextLine();
			if (input.equals("quit")) {
				break;
			}

			String[] inputCommands = input.split(" ");
			String command = inputCommands[0];
			int amount = Integer.valueOf(inputCommands[1]);
			amount = Integer.max(amount, 0);

			switch (command) {
				case "add":
					c1 += Integer.max(amount, 0);
					c1 = Integer.min(100, c1);
					break;
				case "move":
					int toMove = Integer.min(c1, amount);
					c1 -= toMove;
					c2 += toMove;
					c2 = Integer.min(100, c2);
					break;
				case "remove":
					int toRemove = Integer.min(c2, amount);
					c2 -= toRemove;
					c2 = Integer.max(0, c2);
					break;
			}

		}
	}

}
