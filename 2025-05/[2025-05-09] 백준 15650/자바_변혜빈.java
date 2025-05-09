import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int n, m;
	public static int[] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		visited = new boolean[n + 1];

		recur(0, 1);
		System.out.print(sb);
	}

	public static void recur(int depth, int start) {
		if (depth == m) {
			for (int i = 0; i < m; i++)
				sb.append(arr[i]).append(" ");
			sb.append("\n");
			return;
		}

		for (int i = start; i <= n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i;
				recur(depth + 1, i + 1);
				visited[i] = false;
			}
		}
	}
}
