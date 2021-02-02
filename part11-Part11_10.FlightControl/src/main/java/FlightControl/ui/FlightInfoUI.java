package FlightControl.ui;

import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class FlightInfoUI {

	private final Scanner scanner;
	private final FlightControl flightControl;

	public FlightInfoUI(Scanner scanner, FlightControl flightControl) {
		this.scanner = scanner;
		this.flightControl = flightControl;
	}

	public void start() {
		while (true) {
			System.out.println("Flight Control\n"
				+ "[1] Print airplanes\n"
				+ "[2] Print flights\n"
				+ "[3] Print airplane details\n"
				+ "[x] Quit");
			String input = scanner.nextLine();
			switch (input) {
				case "1":
					printAirplanes();
					break;
				case "2":
					printFlights();
					break;
				case "3":
					printAirplaneDetails();
					break;
				case "x":
					return;
			}
		}
	}

	private void printAirplanes() {
		flightControl.getAirplanes().forEach(System.out::println);
	}

	private void printFlights() {
		flightControl.getFlights().forEach(System.out::println);
	}

	private void printAirplaneDetails() {
		System.out.println("Give the airplane id:");
		String input = scanner.nextLine();
		System.out.println(flightControl.getAirplane(input));
	}
}
