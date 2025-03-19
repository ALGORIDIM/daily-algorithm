import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
// Scanner는 int값을 바로 받을 수 있지만
// 숫자를 뒤집는 과정에서 int를 바로 연산하는 것보다
// StringBuilder의 reverse() 매서드를 사용하는 것이
// 더 간결하다고 판단해서 BufferedReader로 입력을 받음
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(new StringBuilder(str[0]).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(str[1]).reverse().toString());
		System.out.print(a > b? a : b);

		br.close();
    }
}