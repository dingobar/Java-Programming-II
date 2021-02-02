
public class MagicSquareFactory {

	public MagicSquare createMagicSquare(int size) {

		MagicSquare square = new MagicSquare(size);

		// implement the creation of a magic square with the Siamese method algorithm here
		int y = 0;
		int x = (int) Math.floor(square.getWidth() / 2.0);
		int value = 1;

		// Set first value
		square.placeValue(x, y, value);

		// Iterate through rest of square
		while (!square.isMagicSquare()) {
			value++;
			if (value > size * size) {
				break;
			}
			// Move
			if (square.readValue(stepForwards(x, size), stepBackwards(y, size)) == 0) {
				x = stepForwards(x, size);
				y = stepBackwards(y, size);
			} else {
				y = stepForwards(y, size);
			}
			// Set current value
			square.placeValue(x, y, value);
		}
		return square;
	}

	private static int stepForwards(int x, int size) {
		return x + 1 > size - 1 ? 0 : x + 1;
	}

	private static int stepBackwards(int x, int size) {
		return x - 1 < 0 ? size - 1 : x - 1;
	}

}
