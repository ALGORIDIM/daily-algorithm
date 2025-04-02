import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		char[] input = scn.nextLine().toCharArray();

		for (int i = 0; i < input.length; i++) {
			int unicode = input[i] - 3;
			if (unicode < 65)
				unicode = unicode + 26;
			input[i] = (char) unicode;
		}

		System.out.print(input);

		// 자원 반환
		scn.close();
	}
}
