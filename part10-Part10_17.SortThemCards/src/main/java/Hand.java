
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

	private final List<Card> cards;

	public Hand() {
		cards = new ArrayList<>();
	}

	public void add(Card card) {
		cards.add(card);
	}

	public void print() {
		cards.forEach(System.out::println);
	}

	public void sort() {
		Collections.sort(cards);
	}

	public void sortBySuit() {
		Collections.sort(cards, new BySuitInValueOrder());
	}

	private int sumOfValues() {
		return cards.stream().mapToInt(c -> c.getValue()).sum();
	}

	@Override
	public int compareTo(Hand arg0) {
		if (sumOfValues() == arg0.sumOfValues()) {
			return 0;
		}
		return sumOfValues() > arg0.sumOfValues() ? 1 : -1;
	}
}
