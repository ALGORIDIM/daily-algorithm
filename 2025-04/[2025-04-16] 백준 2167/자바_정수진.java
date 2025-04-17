import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for(int n=0; n<N; n++){
            st=new StringTokenizer(br.readLine());
            for(int m=0; m<M; m++){
                arr[n][m] = Integer.parseInt(st.nextToken());
            }
        }

        int K=Integer.parseInt(br.readLine());

        for(int k=0; k<K; k++){
            st=new StringTokenizer(br.readLine());
            int[] ijxy=new int[4];
            for(int i=0; i<4; i++){
                ijxy[i]=Integer.parseInt(st.nextToken())-1;
            }

            int sum=0;
            for(int i=ijxy[0]; i<=ijxy[2]; i++){
                for(int j=ijxy[1]; j<=ijxy[3]; j++){
                    sum+=arr[i][j];
                }
            }

            bw.write(Integer.toString(sum)+"\n");

        }
        bw.close();
    }
}