package Prepare;

// Stdin and Stdout 2

import java.util.Scanner;

public class Problem3 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String input_int = Integer.toString(scan.nextInt());
        String input_double = Double.toString(scan.nextDouble());
//        String input_str = scan.next(); // 공백문자전까지 입력받음
        scan.nextLine(); // next double에 붙어있던 공백을 받아주는 역할. 그래야 input_str에 값이 들어갈 수 있다.
        String input_str = scan.nextLine();


        System.out.println("String: " + input_str);
        System.out.println("Double: " + input_double);
        System.out.println("Int: "+ input_int);

    }

}
