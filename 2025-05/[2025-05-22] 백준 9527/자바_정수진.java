//9527번 : 1의 개수 세기
public class Main {
    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        System.out.println(countOnes(B) - countOnes(A - 1));
    }

    static long countOnes(long n) {
        long count=0;
        long bit=1;

        while(bit<=n){
            long fullCycle=n/(bit*2);
            count+=fullCycle*bit;

            long remainder=n%(bit*2);
            if(remainder>=bit)
                count+=remainder-bit+1;

            bit*=2;
        }

        return count;
    }
}
