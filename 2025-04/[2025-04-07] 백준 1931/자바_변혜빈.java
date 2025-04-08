import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] meeting = new int[n][2]; // 정렬 필요함

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			meeting[i][0] = Integer.parseInt(st.nextToken());
			meeting[i][1] = Integer.parseInt(st.nextToken());
		}

		// 회의들을 끝나는 시간 기준으로 정렬
		Arrays.sort(meeting, (a, b) -> {
			if (a[1] == b[1])
				return a[0] - b[0]; // 끝나는 시간 같으면 시작 시간 기준
			return a[1] - b[1];
		});

		// 그리디
		int result = 0;
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (meeting[i][0] >= index) {
				index = meeting[i][1];
				result++;
			}
		}

		System.out.print(result);

		br.close();
	}
}