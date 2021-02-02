
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

	private final Map<String, Integer> wares;
	private final Map<String, Integer> stock;

	public Warehouse() {
		this.wares = new HashMap<>();
		this.stock = new HashMap<>();
	}

	public void addProduct(String product, int price, int stock) {
		wares.put(product, price);
		this.stock.put(product, stock);
	}

	public int price(String product) {
		return wares.getOrDefault(product, -99);
	}

	public int stock(String product) {
		return stock.getOrDefault(product, 0);
	}

	public boolean take(String product) {
		if (wares.containsKey(product)) {
			int currentStock = stock.get(product) - 1;
			if (currentStock < 0) {
				return false;
			}
			stock.put(product, currentStock);
			return true;
		} else {
			return false;
		}
	}

	public Set<String> products() {
		return wares.keySet();
	}

}
