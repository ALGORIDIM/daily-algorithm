import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] six = new int[N];
        int index=0;

        //666부터 쭉 증가
        for(int n=666; ; n++){
            String str = Integer.toString(n); //문자열로 변환
            int strLen = str.length();

            //문자열 길이중에 3개가 6인지 체크
            for(int i=0; i<strLen-2; i++){
                if(str.charAt(i)=='6' && str.charAt(i+1)=='6' && str.charAt(i+2)=='6'){
                    six[index]=Integer.parseInt(str);
                    index+=1;
                    break;
                }
            }
            if(index>=N) break; //다 찾았으면 끝

        }

        System.out.print(six[N-1]);

    }

}