import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		// 1. 배열 정보 입력 받기
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] array = new int[n + 1][m + 1]; // 1 based index
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= m; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 2. 누적합 배열 만들기
		int[][] prefixSum = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				// 1-based이기 때문에 경계 체크 필요 X
				prefixSum[i][j] = prefixSum[i - 1][j]
						+ prefixSum[i][j - 1]
						- prefixSum[i - 1][j - 1]
						+ array[i][j];
			}
		}

		// 3. 입력 정보 받기
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			// 4. 출력값 구하기
			int result = prefixSum[c][d]
					- prefixSum[a - 1][d]
					- prefixSum[c][b - 1]
					+ prefixSum[a - 1][b - 1];
			sb.append(String.valueOf(result) + "\n");
		}

		System.out.print(sb);
		br.close();
	}
}