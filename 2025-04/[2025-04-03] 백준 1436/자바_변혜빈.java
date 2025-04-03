import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cnt = 0;
		for (int i = 666;; i++) {
			String str = String.valueOf(i);
			if (str.contains("666")) {
				if (++cnt == n) {
					System.out.print(str);
					break;
				}
			}
		}
		sc.close();
	}
}
