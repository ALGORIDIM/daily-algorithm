import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] cnt=new int[2];
        //2-> cnt[0], 5-> cnt[1]

        for(int i=1; i<=N; i++){
            int n=i;
            while(true){
                if(n%2==0){
                    cnt[0]++;
                    n/=2;
                }
                else if(n%5==0){
                    cnt[1]++;
                    n/=5;
                }
                else break;
            }
        }

        bw.write(Integer.toString(Math.min(cnt[0],cnt[1])));

        bw.flush();
        bw.close();
        br.close();
    }

}