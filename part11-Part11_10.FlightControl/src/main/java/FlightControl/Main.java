package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.FlightControlUI;
import FlightControl.ui.FlightInfoUI;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Flight control
		FlightControlUI flightControlUi = new FlightControlUI(scanner);
		FlightControl fc = flightControlUi.start();
		// Flight information
		FlightInfoUI flightInfoUi = new FlightInfoUI(scanner, fc);
		flightInfoUi.start();
	}
}
