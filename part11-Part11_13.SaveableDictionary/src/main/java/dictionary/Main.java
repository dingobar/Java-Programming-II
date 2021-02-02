package dictionary;

public class Main {

	public static void main(String[] args) {
		// You can test your dictionary here

		SaveableDictionary s = new SaveableDictionary("lol.txt");
		s.add("apina", "monkey");
		s.add("tietokone", "computer");
		String lol = s.translate("monkey");
		System.out.println(lol);
	}
}
