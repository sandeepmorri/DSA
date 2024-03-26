import java.util.Arrays;
import java.util.Comparator;

public class KnapSack {
    public static void Knapsack(int[] w, int[] p, int c) {
        int[][] a = new int[w.length][3];
        for (int i = 0; i < a.length; i++) {
            a[i][0] = w[i];
            a[i][1] = p[i];
            a[i][2] = p[i] / w[i];
        }
        int profit = 0;
        Arrays.sort(a, Comparator.comparingDouble(o -> o[2]));
        for (int i = a.length - 1; i >= 0; i--) {
            if (c >= a[i][0]) {
                profit += a[i][1];
                c -= a[i][0];
            } else {
                profit += (c * a[i][2]);
                break;
            }
        }
        System.out.println(profit);
    }
    public static void main(String args[]){
    int[] w = { 30,60,90};
        int[] p = { 10, 20, 40 };
        int c = 120;
        Knapsack(w, p, c);
    }
}
