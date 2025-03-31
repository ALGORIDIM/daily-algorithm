import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //바구니 N개를 M번 역순 바꾸기, i부터 j까지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bucket = new int[N];
        int start,end,temp;

        for(int i=0; i<N; i++) bucket[i]=i+1;

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");

            //1~3까지면 인덱스로 0~2까지임
            start = Integer.parseInt(st.nextToken())-1;
            end = Integer.parseInt(st.nextToken())-1;

            //start,end를 좁혀가며 바구니 뒤집기
            while(start<end){
                temp = bucket[start];
                bucket[start]=bucket[end];
                bucket[end]=temp;

                start+=1;
                end-=1;
            }
        }
        br.close();
        for(int num : bucket) System.out.print(num+" ");
    }
}