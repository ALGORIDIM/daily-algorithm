import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 자바_정수진 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] tri=new int [3];
        while(true){
            st=new StringTokenizer(br.readLine());
            tri[0]=Integer.parseInt(st.nextToken());
            tri[1]=Integer.parseInt(st.nextToken());
            tri[2]=Integer.parseInt(st.nextToken());

            if(tri[0]==0) break;

            Arrays.sort(tri);

            if(Math.pow(tri[0],2)+Math.pow(tri[1],2)==Math.pow(tri[2],2))
                bw.write("right");
            else bw.write("wrong");
            bw.newLine();
        }
        bw.close();
    }
}