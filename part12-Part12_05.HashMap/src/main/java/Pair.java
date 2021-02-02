
import java.util.AbstractMap.SimpleEntry;
import java.util.Map;


public class Pair<K, V> extends SimpleEntry {

	public Pair(K key, V value) {
		super(key, value);
	}

	public Pair(Map.Entry entry) {
		super(entry);
	}

}
