
import java.util.Objects;

public class Item {

	private final String name;
	private int quantity;
	private final int unitPrice;

	public Item(String name, int quantity, int unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int price() {
		return quantity * unitPrice;
	}

	public void increaseQuantity() {
		quantity++;
	}

	@Override
	public String toString() {
		return name + ": " + quantity;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 11 * hash + Objects.hashCode(this.name);
		hash = 11 * hash + this.unitPrice;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Item other = (Item) obj;
		if (this.unitPrice != other.unitPrice) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		return true;
	}

}
