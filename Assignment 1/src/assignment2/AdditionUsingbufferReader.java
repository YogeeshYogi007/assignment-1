package assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AdditionUsingbufferReader {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter The First Number:");	
	BufferedReader Br =new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(Br.readLine());
	
	System.out.println("Enter The Second Number:");
	BufferedReader Br1 =new BufferedReader(new InputStreamReader(System.in));
	int b=Integer.parseInt(Br1.readLine());
	
	 int c=a+b;
	System.out.println("Sum Of Two Number is:"+c);

	}

}
