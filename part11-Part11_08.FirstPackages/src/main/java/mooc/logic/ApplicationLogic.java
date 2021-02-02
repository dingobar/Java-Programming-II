package mooc.logic;

import java.util.stream.IntStream;
import mooc.ui.UserInterface;

public class ApplicationLogic {
	
	private final UserInterface ui;
	
	public ApplicationLogic(UserInterface ui) {
		this.ui = ui;
	}
	
	public void execute(int times) {
		IntStream.range(0, times).forEach(i -> {
			System.out.println("Application logic is working");
			ui.update();
		});
	}
}
