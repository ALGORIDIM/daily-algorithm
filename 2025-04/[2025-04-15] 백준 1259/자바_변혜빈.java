import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(br.readLine());
		while (!sb.toString().equals("0")) {
			boolean flag = true;
			for (int i = 0; i < sb.length() / 2; i++) {
				if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
					flag = false;
					break;
				}
			}
			bw.write(flag ? "yes\n" : "no\n");
			sb = new StringBuilder(br.readLine());
		}
		bw.flush();

		br.close();
		bw.close();
	}
}