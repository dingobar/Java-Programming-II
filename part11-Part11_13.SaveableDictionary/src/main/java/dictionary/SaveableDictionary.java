package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SaveableDictionary {

	private Map<String, String> dict;
	private final String filename;

	public SaveableDictionary() {
		this.dict = new HashMap<>();
		this.filename = null;
	}

	public SaveableDictionary(String filename) {
		this.dict = new HashMap<>();
		this.filename = filename;
	}

	public boolean load() {
		try {
			this.dict = readDictFile(filename);
			return true;
		} catch (FileNotFoundException ex) {
			return false;
		}
	}

	public boolean save() {
		try {
			try ( PrintWriter outfile = new PrintWriter(new FileOutputStream(filename, false))) {
				StringBuilder sb = new StringBuilder();
				dict.forEach((k, v) -> sb.append(k).append(":").append(v).append("\n"));
				outfile.write(sb.toString().trim());
			}
			return true;
		} catch (IOException ex) {
			return false;
		}
	}

	private static Map<String, String> readDictFile(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner input = new Scanner(file);
		Map<String, String> output = new HashMap<>();

		while (input.hasNextLine()) {
			String[] keyAndValue = input.nextLine().split(":");
			output.put(keyAndValue[0], keyAndValue[1]);
		}
		return output;
	}

	public void add(String words, String translation) {
		if (!dict.keySet().contains(words)) {
			dict.put(words, translation);
		}
	}

	public String translate(String word) {
		String translation = dict.get(word);
		if (translation == null) {

			Map<String, String> mapInversed
				= dict.entrySet()
					.stream()
					.collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
			return mapInversed.get(word);
		} else {
			return translation;
		}
	}

	public void delete(String word) {
		if (dict.containsKey(word)) {
			dict.remove(word);
			return;
		}
		String lol2 = dict.keySet()
			.stream()
			.filter(key -> word.equals(dict.get(key)))
			.findFirst().get();
		if (dict.containsKey(lol2)) {
			dict.remove(lol2);
		}

	}
}
