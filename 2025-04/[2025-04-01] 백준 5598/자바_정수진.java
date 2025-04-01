import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int strLen = str.length();

        //A:65 Z:90
        for(int i=0; i<strLen; i++){
            int ascii = (int)str.charAt(i)-3;
            if(ascii<65) ascii+=26;
            sb.append((char)ascii);
        }

        System.out.print(sb.toString());
    }

}