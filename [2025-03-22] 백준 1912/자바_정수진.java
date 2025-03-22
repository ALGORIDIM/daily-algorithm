import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];
        int[] nList = new int[N];

        //공백있는 수열의 경우 split()보다 StringTokenizer가 효율적.
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++)
            nList[i] = Integer.parseInt(st.nextToken());

        //max와 dp는 수열 첫번째로 초기화
        int max = nList[0];
        dp[0]=nList[0];

        for(int i=1; i<N; i++){
            //이전 dp+현재 값 or 현재 값 중에 큰 값 dp에 저장.
            dp[i]=Math.max(dp[i-1]+nList[i],nList[i]);
            //dp가 max 보다 커지면 업데이트
            max = Math.max(dp[i],max);
        }

        System.out.print(max);
    }
}