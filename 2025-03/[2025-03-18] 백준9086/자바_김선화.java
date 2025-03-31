import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        
        // 테스트 케이스의 개수 입력받기
        int T = input.nextInt();
        
        // T번 만큼 반복해서 입력받고 처리하기
        for (int i = 0; i < T; i++) {
            String s = input.next();  // 각 문자열을 입력받음
            
            // 첫 글자와 마지막 글자 추출
            char first_char = s.charAt(0);
            char last_char = s.charAt(s.length() - 1);
            
            // 첫 글자와 마지막 글자를 출력
            System.out.println(first_char + "" + last_char);
        }
        
        input.close();  // Scanner 닫기
    }
}
