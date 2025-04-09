import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		boolean[] prime = new boolean[n + 1];

		// 소수 판별 -> 에라토스테네스의 체
		for (int i = 2; i <= n; i++) {
			if (!prime[i]) {
				if (i >= m)
					bw.append(String.valueOf(i) + "\n");
				for (int j = i; j <= n; j += i) {
					prime[j] = true;
				}
			}

		}

		bw.flush();

		br.close();
		bw.close();
	}
}