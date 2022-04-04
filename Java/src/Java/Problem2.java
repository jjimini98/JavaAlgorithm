package Java;

// If- Else
import java.util.Scanner;

public class Problem2 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if (N%2 !=0) {
            System.out.println("Weird");
        }
        else if (N%2==0 && (N>=2 && N<=5)) {
            System.out.println("Not Weird");
        }
        else if (N%2==0 &&(N>=6 && N<=20)) {
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }


    }
}
