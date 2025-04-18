import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 자바_정수진 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //소문자 아스키코드 -> 97~122 // 아스키코드-96;
        int r=31;
        int M = 1234567891;

        int L = Integer.parseInt(br.readLine());
        sb.append(br.readLine());

        long hash=0;
        long p=1;

        //Math.pow -> 연산 너무 오래걸림!!
        for(int i=0; i<L; i++) {
            int ch = sb.charAt(i) - 96;
            hash = (hash + ch * p) % M;
            p = (p * r) % M; //제곱 가중치
        }

        bw.write(Long.toString(hash));
        bw.close();
    }

}