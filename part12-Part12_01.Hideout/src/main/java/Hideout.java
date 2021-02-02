
import java.util.LinkedList;

public class Hideout<T> {

	private final LinkedList<T> content;

	public Hideout() {
		content = new LinkedList<>();
	}

	public void putIntoHideout(T toHide) {
		content.clear();
		content.add(toHide);
	}

	public T takeFromHideout() {
		return content.poll();
	}

	public boolean isInHideout() {
		return !content.isEmpty();
	}
}
