
public class ProductWarehouseWithHistory extends ProductWarehouse {

	private final ChangeHistory changeHistory;

	public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
		super(name, capacity);
		this.changeHistory = new ChangeHistory();
		this.changeHistory.add(initialBalance);
		super.addToWarehouse(initialBalance);
	}

	public String history() {
		return changeHistory.toString();
	}

	@Override
	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		changeHistory.add(getBalance());
	}

	@Override
	public double takeFromWarehouse(double amount) {
		double amountTaken = super.takeFromWarehouse(amount);
		changeHistory.add(getBalance());
		return amountTaken;
	}

	public void printAnalysis() {
		System.out.println("Product: " + getName());
		System.out.println("History: " + changeHistory);
		System.out.println("Largest amount of product: " + changeHistory.maxValue());
		System.out.println("Smallest amount of product: " + changeHistory.minValue());
		System.out.println("Average: " + changeHistory.average());
	}
}
