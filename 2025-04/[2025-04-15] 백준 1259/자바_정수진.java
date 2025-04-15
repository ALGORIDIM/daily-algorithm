import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;

        while(true){
            String str = br.readLine();
            if(str.equals("0")) break;

            sb = new StringBuilder();
            if(sb.append(str).reverse().toString().equals(str))
                bw.write("yes\n");
            else bw.write("no\n");
        }

        bw.close();
    }
}