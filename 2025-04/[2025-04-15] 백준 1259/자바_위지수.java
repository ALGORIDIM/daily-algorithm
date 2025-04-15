import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String number = sc.nextLine();

            if (number.equals("0")) break;

            //입력값 반대로 저장
            String reversed = new StringBuilder(number).reverse().toString();
		
            //문자열 비교
            if (number.equals(reversed)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}