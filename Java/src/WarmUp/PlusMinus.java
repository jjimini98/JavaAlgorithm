package WarmUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
       int criteria  = arr.size();
       List<Integer>plus = new ArrayList<>();
       List<Integer>minus = new ArrayList<>();
       List<Integer>zero = new ArrayList<>();

       for (int i = 0 ; i<criteria; i++){
           if (arr.get(i) < 0) {
               minus.add(arr.get(i));
           }
           else if (arr.get(i)>0) {
               plus.add(arr.get(i));
           }
           else {
               zero.add(arr.get(i));
           }
       }

        System.out.println(String.format("%.6f", (float)plus.size()/criteria));
        System.out.println(String.format("%.6f", (float)minus.size()/criteria));
        System.out.println(String.format("%.6f", (float)zero.size()/criteria));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }


}
