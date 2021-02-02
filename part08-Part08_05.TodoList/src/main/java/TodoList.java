
import java.util.ArrayList;
import java.util.stream.IntStream;

public class TodoList {

	private final ArrayList<TodoItem> items;

	public TodoList() {
		items = new ArrayList<>();
	}

	public void add(TodoItem item) {
		items.add(item);
	}

	public void add(String s) {
		items.add(new TodoItem(s));
	}

	public void remove(int index) {
		items.remove(index - 1);
	}

	public void print() {
		IntStream.range(0, items.size()).forEach((i) -> {
			System.out.println(i + 1 + ": " + items.get(i));
		});
	}

}
