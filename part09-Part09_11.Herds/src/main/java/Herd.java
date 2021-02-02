
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

	private final List<Movable> herdMembers;

	public Herd() {
		this.herdMembers = new ArrayList<>();
	}

	public void addToHerd(Movable movable) {
		herdMembers.add(movable);
	}

	@Override
	public void move(int dx, int dy) {
		herdMembers.forEach(i -> i.move(dx, dy));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		herdMembers.forEach(i -> sb.append(i.toString()).append("\n"));
		return sb.toString().trim();
	}

}
