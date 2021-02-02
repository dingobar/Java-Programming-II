
import java.util.Scanner;

public class LiquidContainers2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Container c1 = new Container();
		Container c2 = new Container();

		while (true) {
			System.out.println("First: " + c1.contains() + "/100\n"
				+ "Second: " + c2.contains() + "/100"
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
					c1.add(amount);
					break;
				case "move":
					c1.moveTo(c2, amount);
					break;
				case "remove":
					c2.remove(amount);
					break;
			}

		}
	}

}
