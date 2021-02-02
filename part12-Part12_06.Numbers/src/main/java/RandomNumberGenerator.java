
import java.util.Random;

public class RandomNumberGenerator {

	Random random;

	public RandomNumberGenerator() {
		random = new Random();
	}

	public int generate() {
		return random.nextInt(11);
	}

}
