import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //한 줄 입력은 무조건 토큰화
        int M = Integer.parseInt(st.nextToken());

        int[] nList= new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) nList[i]=Integer.parseInt(st.nextToken());

        int max = nList[0];

        for(int i=0; i<N-2; i++)
            for(int j=i+1; j<N-1; j++)
                for(int k=j+1; k<N; k++) {
                    int total = nList[i] + nList[j] + nList[k];
                    if (total <= M && total > max) max = total;
                }

        System.out.print(max);
    }

}