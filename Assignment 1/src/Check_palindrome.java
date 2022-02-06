import java.util.Scanner;

public class Check_palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r, sum = 0, temp;
		System.out.println("Enter the Number:");
		int n = sc.nextInt();

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println(temp + " Is a palindrome ");
		else
			System.out.println(temp + " Is not a palindrome");

	}

}
