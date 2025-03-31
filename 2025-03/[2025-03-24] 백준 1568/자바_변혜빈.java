import java.io.BufferedReader;
import java.io.InputStreamReader;

// memo
// 10^9보다 작거나 같은 자연수 -> int로 커버됨

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int birds = Integer.parseInt(br.readLine()); // 나무에 앉아 있는 새의 마릿수
		int k = 1;
		int time = 0;
		while (birds > 0) {
			if (birds < k)
				k = 1;
			birds -= k;
			time++;
			k++;
		}
		System.out.println(time);
	}
}
