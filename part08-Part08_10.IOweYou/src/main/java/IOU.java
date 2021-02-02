
import java.util.HashMap;

public class IOU {

	private final HashMap<String, Double> owings;

	public IOU() {
		owings = new HashMap<>();
	}

	public void setSum(String toWhom, double amount) {
		owings.put(toWhom, amount);
	}

	public double howMuchDoIOweTo(String toWhom) {
		return owings.getOrDefault(toWhom, 0.0);
	}
	
}
