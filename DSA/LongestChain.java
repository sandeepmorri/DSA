import java.util.Arrays;
import java.util.Comparator;

public class LongestChain {
     public static void longestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chain = 1;
        int last = pairs[0][1];
        for (int i = 0; i < pairs.length; i++) {
            if (last < pairs[i][0]) {
                chain++;
                last = pairs[i][1];

            }
        }
        System.out.println(chain);
    }
    public static void main(String[] args) {
        int[][] a = { { 2, 3 }, { 3, 4 }, { 4, 5 }, { 6, 7 } };
        longestChain(a);
    }
}
