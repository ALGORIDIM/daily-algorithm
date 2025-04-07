import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 자바_정수진 {
    public static void main(String[] args) throws Exception {
        //끝난시간 정렬 후에 시작 시간만 그 안에 들어가지는지 체킹하면됨

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] time=new int[N][2];
        StringTokenizer st ;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        //2차원 배열 정렬
        //두번째 숫자 오름차순 -> 숫자가 같은 경우 첫번째 숫자 오름차순
        Arrays.sort(time, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[1]==o2[1]?o1[0]-o2[0]:o1[1]-o2[1];
            }

        });

        int curEnd=0;
        int cnt=0;

        for(int i=0; i<N; i++) {
            //앞에서 끝난 시간 <= 다음 비교할 시작시간
            if(curEnd<=time[i][0]) {
                //끝난 시간은 이번에 끝난 시간으로 업데이트
                curEnd = time[i][1];
                cnt++;
            }
        }

        System.out.print(cnt);

    }
}