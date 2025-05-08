import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int n; // 1~n 사이의 수를 선정
	public static int m; // 선정할 숫자의 개수
	public static StringBuilder sb = new StringBuilder();
	public static int[] arr;
	public static boolean[] visited; // contains느려서 걍 배열로

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		visited = new boolean[n + 1];

		recur(0);
		System.out.print(sb);

		br.close();
	}

	public static void recur(int depth) {
		// 기저조건: m개의 수를 모두 뽑았다면
		if (depth == m) {
			for (int i = 0; i < m; i++)
				sb.append(arr[i]).append(" ");
			sb.append("\n");
			return;
		}

		// 현재 depth(자릿수)의 숫자 선정하기 -> m개의 수를 뽑을 때까지..
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) { // 중복 불가능
				visited[i] = true;
				arr[depth] = i;
				recur(depth + 1);
				visited[i] = false;
			}
		}

	}
}
