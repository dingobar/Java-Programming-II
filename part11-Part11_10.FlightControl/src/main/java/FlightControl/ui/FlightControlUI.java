package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class FlightControlUI {

	private final Scanner scanner;
	private final FlightControl flightControl;

	public FlightControlUI(Scanner scanner) {
		this.scanner = scanner;
		flightControl = new FlightControl();
	}

	public FlightControl start() {
		while (true) {
			System.out.println("Airport Asset Control\n"
				+ "[1] Add an airplane\n"
				+ "[2] Add a flight\n"
				+ "[x] Exit Airport Asset Control");
			String input = scanner.nextLine();
			switch (input) {
				case "1":
					addAirplane();
					break;
				case "2":
					addFlight();
					break;
				case "x":
					return this.flightControl;
			}
		}
	}

	private void addAirplane() {
		System.out.println("Give the airplane id:");
		String id = scanner.nextLine();
		System.out.println("Give the airplane capacity:");
		int capacity = Integer.valueOf(scanner.nextLine());

		flightControl.addAirplane(id, capacity);
	}

	private void addFlight() {
		System.out.println("Give the airplane id:");
		Airplane plane = flightControl.getAirplane(scanner.nextLine());
		System.out.println("Give the departure airport id:");
		String pol = scanner.nextLine();
		System.out.println("Give the target airport id: ");
		String pod = scanner.nextLine();

		flightControl.addFlight(plane, pol, pod);
	}
}
