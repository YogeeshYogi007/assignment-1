package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int originalNumber, remainder, result = 0, n = 0;
	System.out.println("Enter a Number:");
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader Br=new BufferedReader(isr);
	int w =Integer.parseInt(Br.readLine());

	originalNumber = w;

	for (; originalNumber != 0; originalNumber /= 10, ++n)
		;

	originalNumber = w;

	for (; originalNumber != 0; originalNumber /= 10) {
		remainder = originalNumber % 10;
		result += Math.pow(remainder, n);
	}

	if (result == w)
		System.out.println(w + " is an Armstrong number.");
	else
		System.out.println(w + " is not an Armstrong number.");

}
}
