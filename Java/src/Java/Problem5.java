package Java;

// java loop


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i < 11; i++){
            int result = N * i ;
            System.out.printf("%d x %d = %d \n", N , i , result);
        }

        bufferedReader.close();
    }
}
