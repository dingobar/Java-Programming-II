
import java.util.ArrayList;

public class Box implements Packable {

	private final ArrayList<Packable> items;
	private final double maxWeight;

	public Box(double maxWeight) {
		this.items = new ArrayList<>();
		this.maxWeight = maxWeight;
	}

	@Override
	public double weight() {
		return items.stream().mapToDouble(i -> i.weight()).sum();
	}

	public void add(Packable item) {
		if (weight() + item.weight() <= maxWeight) {
			items.add(item);
		}
	}

	@Override
	public String toString() {
		return "Box: "
			+ items.size()
			+ " items, total weight "
			+ weight() + " kg";
	}

}
