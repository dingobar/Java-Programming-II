
import java.util.LinkedList;

public class Pipe<T> {

	LinkedList<T> content;

	public Pipe() {
		content = new LinkedList<>();
	}

	public void putIntoPipe(T value) {
		content.push(value);
	}

	public T takeFromPipe() {
		return content.pollLast();
	}

	public boolean isInPipe() {
		return !content.isEmpty();
	}

}
