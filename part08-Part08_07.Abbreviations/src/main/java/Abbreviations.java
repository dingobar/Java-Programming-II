
import java.util.HashMap;

public class Abbreviations {

	private final HashMap<String, String> translations;

	public Abbreviations() {
		translations = new HashMap<>();
	}

	public void addAbbreviation(String abbreviation, String explanation) {
		translations.put(abbreviation, explanation);
	}

	public boolean hasAbbreviation(String abbreviation) {
		return translations.containsKey(abbreviation);
	}

	public String findExplanationFor(String abbreviation) {
		return translations.get(abbreviation);
	}
}
