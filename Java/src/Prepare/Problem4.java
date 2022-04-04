package Prepare;

import java.util.Scanner;

// printf 정렬에 관한 문제... 복습해두기

public class Problem4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scan.next();
//            int x=scan.nextInt();
//            scan.nextLine();
            //Complete this line
            String x1= Integer.toString(scan.nextInt());

            if (x1.length() < 3) {
                for (int j = x1.length(); j < 3 ; j++){
                    x1 = "0"+x1;}
            }
            System.out.printf("%-14s %s", s1, x1);
            System.out.println();
        }
        System.out.println("================================");



    }


}
