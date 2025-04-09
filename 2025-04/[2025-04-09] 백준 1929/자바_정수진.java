import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 자바_정수진 {
    static final int MAX=1000000;
    static int[] minPrime = new int[MAX+1];

    //에라토스테네스의 체 응용

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        makeMinPrime();

        for (int i = M; i <= N; i++) {
            if(minPrime[i]==i)
                sb.append(minPrime[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }

    static void makeMinPrime(){
        for(int i=2; i<=MAX; i++){
            if(minPrime[i]==0){
                for(int j=i; j<=MAX; j+=i){
                    //i의 배수는 최소 소인수가 다 i
                    //에라토스테네스의 체 응용
                    if(minPrime[j]==0) minPrime[j]=i;
                }
            }
        }
    }
}
