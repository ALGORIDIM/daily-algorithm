import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 자바_정수진 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Long.toString(nFact(n)));
        bw.flush();
        bw.close();
    }

    static long nFact(int n){
        if(n<2) return 1;
        else return n*nFact(n-1);
    }

}