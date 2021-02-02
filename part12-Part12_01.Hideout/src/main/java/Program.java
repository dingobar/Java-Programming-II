
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// you may try out your class here
		Hideout<String> den = new Hideout<>();
		System.out.println(den.isInHideout());
		den.putIntoHideout("peekaboo");
		System.out.println(den.isInHideout());
		System.out.println(den.takeFromHideout());
		System.out.println(den.isInHideout());
		den.putIntoHideout("toodaloo");
		den.putIntoHideout("heelloo");
		System.out.println(den.isInHideout());
		System.out.println(den.takeFromHideout());
		System.out.println(den.isInHideout());

		Hideout<Integer> deno = new Hideout<>();
		System.out.println(deno.isInHideout());
		deno.putIntoHideout(1);
		System.out.println(deno.isInHideout());
		System.out.println(deno.isInHideout());
		System.out.println(deno.takeFromHideout());
		System.out.println(deno.isInHideout());
	}
}
