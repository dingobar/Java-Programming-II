
import java.util.Arrays;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		int[][] matrix = {
			{3, 2, 7, 6},
			{2, 4, 1, 0},
			{3, 2, 1, 0}
		};

		System.out.println(arrayAsString(matrix));
	}

	public static String arrayAsString(int[][] array) {
		StringBuilder sb = new StringBuilder();
		Arrays.stream(array).forEach(a -> {
			sb.append(Arrays.stream(a)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining("")));
			sb.append("\n");
		});
		return sb.toString().trim();
	}

}
