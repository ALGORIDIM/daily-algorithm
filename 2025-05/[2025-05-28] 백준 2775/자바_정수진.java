import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());

            int[][] dp = new int[k+1][n+1];

            for(int kk=0; kk<k+1;kk++)
            {
                for(int nn=1; nn<n+1; nn++)
                {
                    if(kk==0) dp[0][nn]=nn;
                    else
                    {
                        for(int nnn=1; nnn<nn+1; nnn++)
                            dp[kk][nn]+=dp[kk-1][nnn];
                    }
                }

            }

            bw.write(Integer.toString(dp[k][n])+'\n');

        }

        bw.flush();
        bw.close();
        br.close();
    }
}