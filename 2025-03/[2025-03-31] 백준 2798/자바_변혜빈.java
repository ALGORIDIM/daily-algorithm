import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// N, M 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// 카드 입력
		st = new StringTokenizer(br.readLine(), " ");
		LinkedList<Integer> cards = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			cards.add(Integer.parseInt(st.nextToken()));
		}
		cards.sort(null); // == cards.sort(Comparator.naturalOrder());

		// 결과 계산 -> 3장 조합의 모든 경우의 수 완전 탐색
		int answer = 0;
		for (int a = 0; a < n; a++) {
			int card_a = cards.get(a);
			for (int b = a + 1; b < n; b++) { // 서로 다른 수, 이미 탐색한 범위는 제외 -> a+1
				int card_b = cards.get(b);
				for (int c = b + 1; c < n; c++) {
					int card_c = cards.get(c);
					int temp = card_a + card_b + card_c;
					if (temp > answer && temp <= m)
						answer = temp;
				}
			}
		}

		// 결과 프린트
		System.out.print(answer);
	}
}
