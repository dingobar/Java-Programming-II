
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

	private final int maxWeight;
	private final ArrayList<Item> items;

	public BoxWithMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
		this.items = new ArrayList<>();
	}

	@Override
	public void add(Item item) {
		if (getWeight() + item.getWeight() <= maxWeight) {
			items.add(item);
		}
	}

	@Override
	public boolean isInBox(Item item) {
		return items.contains(item);
	}

	private int getWeight() {
		return items.stream().mapToInt(i -> i.getWeight()).sum();
	}
}
