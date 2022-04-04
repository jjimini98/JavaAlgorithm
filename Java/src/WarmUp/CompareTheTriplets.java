package WarmUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result_set = new ArrayList<>(Arrays.asList(0,0));
        int score_a = 0, score_b = 0;

        for (int i = 0; i<a.size();i++){
            if (a.get(i) < b.get(i)) {
                score_b+=1;
                result_set.set(1,score_b);}
            else if (a.get(i) > b.get(i)) {
                score_a+=1;
                result_set.set(0,score_a);
            }
        }
        return result_set;



    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = CompareTheTriplets.compareTriplets(a, b);


        System.out.println(result);
    }

}
