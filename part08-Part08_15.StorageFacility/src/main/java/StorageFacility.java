
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StorageFacility {
	
	HashMap<String, ArrayList<String>> items;
	
	public StorageFacility() {
		items = new HashMap<>();
	}
	
	public void add(String unit, String item) {
		items.putIfAbsent(unit, new ArrayList<>());
		
		items.get(unit).add(item);
	}
	
	public ArrayList<String> contents(String storageUnit) {
		return items.getOrDefault(storageUnit, new ArrayList<>());
	}
	
	public void remove(String storageUnit, String item) {
		items.get(storageUnit).remove(item);
	}
	
	public ArrayList<String> storageUnits() {
		return new ArrayList<>(
			items.entrySet().stream()
				.distinct()
				.filter((k) -> !k.getValue().isEmpty())
				.map(Entry::getKey)
				.collect(Collectors.toList())
		);
	}
}
