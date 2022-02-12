import java.util.Scanner;

public class Vowel_or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet :");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Entered Alphabet is a vowel");
		} else {
			System.out.println("Entered Alphabet is not a Vowel");
		}            

	}

}
