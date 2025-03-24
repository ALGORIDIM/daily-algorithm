import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// String의 split 매서드 -> 정규 표현식 사용으로 비교적 느리다 
// -> StringTokenizer는 단순한 토큰 분리로 더 빠르고 가벼움

// Scanner -> 정규 표현식을 사용해 파싱하기 때문에 추가적인 연산이 많고
// 입력을 처리할 때 한 글자, 한 토큰 단위로 분석하기 때문에 비교적 느리다. (공백으로 구분 가능한 이유)
// 반면 BufferedReader는 문자열을 한 줄씩 빠르게 읽기만 하기 때문에 비교적 빠르다.
// 하지만 split 매서드 등 추가적인 작업이 필요할 수 있다.

// Scanner는 nextInt() 매서드를 사용할 수 있지만 내부에서 문자열 파싱, 정규식 검사 과정을 거쳐야 하기 때문에 꽤나 느리다.
// Integer.parseInt() 는 정규식을 쓰지 않고 단순히 각 자리수의 문자코드를 처리하는 가벼운 매서드

// 결론
// 입력이 많을수록 `BufferedReader + StringTokenizer + Integer.parseInt()` 조합이 압도적으로 빠르다.

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// hasMoreToken 검사는 하지 않겠음. 백준을 믿으닉간
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// 배열 초기화
		int[] bucket = new int[n];
		for (int i = 0; i < n; i++) {
			bucket[i] = i + 1;
		}

		// 순서 바꾸기 입력
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;

			while (start < end) {
				int temp = bucket[start];
				bucket[start] = bucket[end];
				bucket[end] = temp;
				start++;
				end--;
			}
		}

		// 출력
		for (int i = 0; i < bucket.length; i++) {
			bw.write(bucket[i] + " ");
		}
		bw.flush();

		// 리소스 정리
		br.close();
		bw.close();
	}
}
