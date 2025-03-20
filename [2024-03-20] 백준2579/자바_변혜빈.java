import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine()); // 계단의 개수
		int[] stair = new int[count]; // 계단마다 부여된 점수
		int[] max = new int[count]; // i번째 계단까지의 최대 점수

		for (int i = 0; i < count; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}

		System.out.print(CalMaxScoreDP(stair, count - 1, max));

	}

	// 점수의 합의 최대값을 구하는 재귀 함수 -> 시간 초과
	public static int CalMaxScore(int[] stair, int num) {
		if (num == -1) // 바닥
			return 0;
		else if (num == 0) // 첫 번째 계단
			return stair[0];
		else if (num == 1) // 두 번째 계단
			return stair[1] + stair[0];

		// (1) 마지막 점수 + 1개 전 (최대) 점수
		// or (2) 마지막 점수 + 2개 전 (최대) 점수
		// 비교해서 큰 쪽으로 반환해야 하므로 Math 함수 사용
		// 연속 3계단 불가능하므로 (1)에서 마지막 점수 + 1개 전 점수 + 3개 전 (최대) 점수로 계산하자
		return Math.max(
				stair[num] + stair[num - 1] + CalMaxScore(stair, num - 3),
				stair[num] + CalMaxScore(stair, num - 2));
	}

	// Dynamic Programming으로 개선
	public static int CalMaxScoreDP(int[] stair, int num, int[] max) {
		if (num == -1)
			return 0;
		else if (num == 0)
			return stair[0];
		else if (num == 1)
			return stair[1] + stair[0];

		// 이전에 계산한 값이 있다면 바로 반환 (dp)
		if (max[num] != 0) // 점수는 자연수이므로 0이라면 값이 배정되지 않은 것
			return max[num];

		max[num] = Math.max(
				stair[num] + stair[num - 1] + CalMaxScoreDP(stair, num - 3, max),
				stair[num] + CalMaxScoreDP(stair, num - 2, max));
		return max[num];
	}
}
