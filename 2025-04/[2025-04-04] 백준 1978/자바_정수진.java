import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자바_정수진 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt=0;

        for(int i=0; i<N; i++) {

            int num = Integer.parseInt(st.nextToken());
            boolean check=true; // 소수이다.

            if (num < 2) continue;
            else if (num==2) { cnt++; continue; }
            // 2일때도 소수임.

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    check=false;
                    break;
                }
            }
            if(check) cnt++;
        }
        System.out.print(cnt);
    }

}