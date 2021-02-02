
import java.util.ArrayList;

public class ChangeHistory {

	private final ArrayList<Double> quantities;

	public ChangeHistory() {
		quantities = new ArrayList<>();
	}

	public void add(double status) {
		quantities.add(status);
	}

	public void clear() {
		quantities.clear();
	}

	@Override
	public String toString() {
		return quantities.toString();
	}

	public double maxValue() {
		return quantities.stream()
			.max(Double::compare)
			.get();
	}

	public double minValue() {
		return quantities.stream()
			.min(Double::compare)
			.get();
	}

	public double average() {
		return quantities.stream()
			.mapToDouble((x) -> x)
			.average()
			.orElse(Double.NaN);
	}
}
