
public class Generate_Multiplication_Table {

	public static void main(String[] args) {
		int n = 5, sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = n * i;
			System.out.println(n + "*" + i + "=" + sum);
		}

	}

}
