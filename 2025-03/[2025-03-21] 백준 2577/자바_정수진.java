import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nCheckList = new int[10];
        int nResult = 1;

        for(int i=0;i<3;i++)
            nResult = nResult * Integer.parseInt(br.readLine());

        while(nResult!=0){
            //결과를 10으로 나눈 나머지(한 자리수)를 인덱스로 사용
            nCheckList[nResult%10]+=1;
            nResult/=10;
        }

        for(int i=0; i<10; i++) System.out.println(nCheckList[i]);

    }
}