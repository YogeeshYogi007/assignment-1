package assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Multiplication {

	public static void main(String[] args) throws NumberFormatException, IOException {
	System.out.println("Enter a Number");
BufferedReader Br3 =new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(Br3.readLine());

	int sum=1;
	for (int i = 1; i <= 10; i++) {
		sum = a * i;
		System.out.println(a + "*" + i + "=" + sum);
	}



		
	}

}
