import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String star="*";
        String space=" ";

        //N층 반복(위 삼각형)
        //N-i 스 i*2-1별
        for(int i=1; i<=N; i++)
            sb.append(space.repeat(N-i)).append(star.repeat(i*2-1)).append("\n");

        // N-1번 반복(아래 삼각형)
        // i스 (N-i)*2-1별
        for(int i=1;i<=N-1;i++)
            sb.append(space.repeat(i)).append(star.repeat((N-i)*2-1)).append("\n");

        System.out.print(sb.toString());
    }
}