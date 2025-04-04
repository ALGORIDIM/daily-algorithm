import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if (num == 1) {
				cnt--;
				continue;
			}

			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
		br.close();
	}
}