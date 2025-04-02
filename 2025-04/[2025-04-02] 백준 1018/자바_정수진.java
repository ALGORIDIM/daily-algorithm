import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] board;
    static int N, M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");//StringTokenizer 보다 직관적

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        board = new char[N][M];

        for (int i = 0; i < N; i++)
            board[i]=br.readLine().toCharArray();
            //char 배열로 저장함

        int minCheck = N*M;

        //8x8 배열 추출
        for(int i=0; i<N-7; i++)
            for(int j=0; j<M-7; j++)
                minCheck=Math.min(minCheck,checkBoard(i,j));


        System.out.print(minCheck);

    }

    static int checkBoard(int x, int y) {
        int wCnt = 0; //W로 시작
        int bCnt = 0; //B로 시작

        //for 문에 중괄호 없으면 변수 선언 불가능
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char check = board[x + i][y + j];

                //i%2==j%2 둘 다 나머지가 같다-> 더했을 때 짝수임
                if ((i + j) % 2 == 0) {
                    if (check != 'W') wCnt++;
                    if (check != 'B') bCnt++;
                }
                else {
                    if (check != 'B') wCnt++;
                    if (check != 'W') bCnt++;
                }
            }
        }

        return Math.min(wCnt,bCnt);
    }
}