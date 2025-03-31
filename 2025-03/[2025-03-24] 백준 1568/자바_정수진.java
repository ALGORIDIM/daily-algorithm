import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K=1; //노래, 날아가는 새 수
        int sec=0; //몇 초 걸리는지

        while(N>=K){
            N-=K;
            K+=1;
            sec+=1;

            if(N<K) K=1;
        }

        System.out.print(sec);

    }
}