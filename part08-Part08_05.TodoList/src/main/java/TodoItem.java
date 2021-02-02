
public class TodoItem {

	private final String task;

	public TodoItem(String task) {
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	@Override
	public String toString() {
		return getTask();
	}

}
