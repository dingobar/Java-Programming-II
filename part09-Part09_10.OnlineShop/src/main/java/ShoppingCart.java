
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private final List<Item> items;

	public ShoppingCart() {
		items = new ArrayList<>();
	}

	public void add(String product, int price) {
		Item itemToAdd = new Item(product, 1, price);
		if (items.contains(itemToAdd)) {
			items.get(items.indexOf(itemToAdd)).increaseQuantity();
		} else {
			items.add(new Item(product, 1, price));
		}

	}

	public int price() {
		return items.stream().mapToInt(i -> i.price()).sum();
	}

	public void print() {
		items.forEach(System.out::println);
	}
}
