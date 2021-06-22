// 10950. A+B - 3

import java.util.Scanner;
public class No4 {
    public static void main(String[]args) {

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        for (int i = 0 ; i<num; i++) {
            Scanner A = new Scanner(System.in);
            int a = A.nextInt();
            int b = A.nextInt();
            if (a == ' '||b==' ') {break;}
            System.out.println(a+b);

        }
    }
}
