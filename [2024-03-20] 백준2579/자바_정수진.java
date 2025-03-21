import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int dp[]=new int[N+1];
        int sList[]=new int[N+1];

        for(int i=1;i<=N;i++)
            sList[i]=Integer.parseInt(br.readLine());

        //반복문으로 풀이 Bottom-up

        //dp[1]은 첫번째 계단 값과 같음
        dp[1]=sList[1];

        //계단이 2개 이상인 경우
        if(N>=2) {
            dp[2]=sList[1]+sList[2];

            //1칸~2칸까지 점프 가능, 연속 2번 1칸씩 가는거 불가능
            //따라서 n-2 or n-1,n-3 계단 밟았을 때 중에 더 큰 값 저장해줌
            for(int i=3; i<=N; i++)
                dp[i]=Math.max(dp[i-2],dp[i-3]+sList[i-1])+sList[i];
        }

        System.out.print(dp[N]);

    }
}