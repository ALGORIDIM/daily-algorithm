import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //위처럼 쓰면 위에서 모든 줄을 다 읽어버리므로 오류가 남! 초기화하는 위치가 중요

        int N = Integer.parseInt(br.readLine());
        int[] numList=new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) numList[i]=Integer.parseInt(st.nextToken());

        int n= Integer.parseInt(br.readLine());

        int cnt=0;
        for(int i=0; i<N; i++) if(numList[i]==n) cnt++;

        System.out.print(cnt);
    }
}