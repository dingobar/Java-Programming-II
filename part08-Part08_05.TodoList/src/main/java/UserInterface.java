
import java.util.Scanner;

public class UserInterface {

	private final TodoList list;
	private final Scanner scanner;

	public UserInterface(TodoList list, Scanner scanner) {
		this.list = list;
		this.scanner = scanner;
	}

	public void start() {
		outer: while (true) {
			String command = commandPrompt();
			switch (command){
				case "add":
					add();
					break;
				case "list":
					list();
					break;
				case "remove":
					remove();
					break;
				default:
					break outer;
			}
		}
	}

	private String commandPrompt() {
		System.out.print("Command: ");
		return scanner.nextLine();
	}
	
	private void add(){
		System.out.print("To add: ");
		list.add(new TodoItem(scanner.nextLine()));
	}
	
	private void list(){
		list.print();
	}
	
	private void remove(){
		System.out.print("Which one is removed? ");
		list.remove(Integer.valueOf(scanner.nextLine()));
	}

}
