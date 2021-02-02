
import java.util.ArrayList;

class HashMap<K, V> {

	private final ArrayList<Pair> values;

	public HashMap() {
		this.values = new ArrayList<>();
	}

	public V get(K key) {
		Pair<K, V> pair = getPair(key);
		if (pair == null) {
			return null;
		}
		return (V) pair.getValue();
	}

	public boolean contains(K key) {
		ArrayList<K> keys = new ArrayList<>();
		values.forEach(a -> keys.add((K) a.getKey()));
		if (keys.isEmpty()) {
			return false;
		}
		return keys.contains(key);
	}

	private Pair getPair(K key) {
		return values.stream()
			.filter(n -> n.getKey().equals(key))
			.findFirst()
			.orElse(null);
	}

	public void add(K key, V value) {
		if (getPair(key) == null) {
			values.add(new Pair(key, value));
		} else {
			getPair(key).setValue(value);
		}
	}

	public V remove(K key) {
		Pair<K, V> pair = getPair(key);
		if (pair == null) {
			return null;
		}
		values.remove(getPair(key));
		return (V) pair.getValue();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		values.forEach(k -> {
			sb.append(k.getKey())
				.append(": ")
				.append(k.getValue())
				.append("\n");
		});
		return sb.toString().trim();
	}

}
