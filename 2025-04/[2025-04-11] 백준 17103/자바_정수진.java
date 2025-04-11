import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 자바_정수진 {
    static final int MAX=1000000;
    static int[] minPrime = new int[MAX+1];

    //에라토스테네스의 체 응용

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        makeMinPrime();

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int cnt=0;

            for (int n=2; n<=N/2; n++) {
                if(minPrime[n]==n && minPrime[N-n]==N-n)
                    cnt++;
            }

            sb.append(cnt).append("\n");
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
