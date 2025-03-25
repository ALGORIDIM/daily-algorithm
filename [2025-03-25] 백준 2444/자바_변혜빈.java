import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			System.out.print(" ".repeat(n - i));
			System.out.println("*".repeat(i + i - 1));
			i++;
		}

		i = n - 1;
		while (i > 0) {
			System.out.print(" ".repeat(n - i));
			System.out.println("*".repeat(i + i - 1));
			i--;
		}
	}
}
