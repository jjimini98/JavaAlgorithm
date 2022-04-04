package Java;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(); // 전체 쿼리 개수
        for (int x = 0; x<q ; x++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int result = a ; // 결과에 해당

            for (int i = 0; i<n ; i++){
                int mpow = (int)Math.pow(2,i);
                result += (mpow*b) ;
                System.out.printf("%d ", result);

            }
            System.out.println("");
        }


    }
}
