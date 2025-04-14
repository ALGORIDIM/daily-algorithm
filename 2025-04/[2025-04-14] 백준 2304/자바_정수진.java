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
        int N = Integer.parseInt(br.readLine());

        int[][] input = new int[N][2];//입력배열
        int[] arr=new int[1001];//기둥 배열
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            input[i][0]=Integer.parseInt(st.nextToken());
            input[i][1]=Integer.parseInt(st.nextToken());
            arr[input[i][0]]=input[i][1]; //기둥 위치에 저장
        }//15

        Arrays.sort(input, (a, b) -> a[0] - b[0]);//배열 정렬
        int start = input[0][0];//기둥 시작 위치 2
        int end = input[N-1][0];//기둥 끝 위치 15

        int[] left = new int[end+1];
        int[] right = new int[end+1];

        left[start]=arr[start];
        for(int i=start; i<end+1; i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }

        right[end]=arr[end];
        for(int i=end-1; i>=start; i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }

        int area = 0;

        for(int i=start; i<=end; i++){
            area+=Math.min(left[i],right[i]);
        }

        bw.write(Integer.toString(area));
        bw.close();
    }
}