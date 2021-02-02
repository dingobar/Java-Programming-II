
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

	@Override
	public int compare(Card c1, Card c2) {
		return (c1.getSuitRank() * 100 + c1.getValue())
			- (c2.getSuitRank() * 100 + c2.getValue());
	}

}
