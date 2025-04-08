import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//무식하게 다 나누기 -> 시간초과
//제곱근까지만 나누고 나머지(소수) 따로 더하기 -> 시간초과

public class 자바_정수진 {
    static final int MAX=5000000;
    static int[] minPrime = new int[MAX+1];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //최소 소인수 리스트 미리 만들기->계속 안나눠도 되고,
        //미리 구한 소수로 계산
        makeMinPrime();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while (num > 1) {
                //최소 소인수를 저장
                sb.append(minPrime[num]).append(" ");
                num /= minPrime[num];
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }

    static void makeMinPrime(){
        for(int i=2; i<=MAX; i++){
            if(minPrime[i]==0){
                for(int j=i; j<=MAX; j+=i){
                    //i의 배수는 최소 소인수가 다 i
                    //에라토스테네스의 체 응용
                    if(minPrime[j]==0) minPrime[j]=i;
                }
            }
        }
    }
}
