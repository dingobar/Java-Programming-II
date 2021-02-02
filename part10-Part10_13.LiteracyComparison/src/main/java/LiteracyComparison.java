
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {

	public static void main(String[] args) {
		try {
			Files.lines(Paths.get("literacy.csv"))
				.map(l -> l.split(","))
				.map(m -> new CountryMetric(m[0], m[1], m[2], m[3], Integer.valueOf(m[4]), Double.valueOf(m[5])))
				.sorted()
				.forEach(System.out::println);
		} catch (IOException ex) {
			Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
