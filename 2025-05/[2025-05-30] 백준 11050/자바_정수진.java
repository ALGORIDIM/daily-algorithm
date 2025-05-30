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

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(combi(N,K)));

        bw.flush();
        bw.close();
        br.close();
    }

    static int combi(int n, int r){
        if(n==r || r==0) return 1;
        return combi(n-1,r-1)+combi(n-1,r);
    }

}