
import java.util.HashMap;

public class VehicleRegistry {

	private final HashMap<LicensePlate, String> vehicles;

	public VehicleRegistry() {
		vehicles = new HashMap<>();
	}

	public boolean add(LicensePlate licensePlate, String owner) {
		if (vehicles.containsKey(licensePlate)) {
			return false;
		}
		vehicles.put(licensePlate, owner);
		return true;
	}

	public String get(LicensePlate licensePlate) {
		return vehicles.get(licensePlate);
	}

	public boolean remove(LicensePlate licensePlate) {
		if (!vehicles.containsKey(licensePlate)) {
			return false;
		}
		vehicles.remove(licensePlate);
		return true;
	}

	public void printLicensePlates() {
		vehicles.keySet()
			.forEach(System.out::println);
	}

	public void printOwners() {
		vehicles.values().stream()
			.distinct()
			.forEach(System.out::println);
	}
}
