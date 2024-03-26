import java.util.Arrays;
import java.util.Comparator;

public class JobSequence {
    public static void main(String[] args) {
        int []deadlines={2,1,2,1,1};
     int []profit={100,19,27,25,15};
        jobSequence(deadlines, profit);
    }
    public static void jobSequence(int[] a, int[] b) {
        int[][] job = new int[a.length][2];
        int days = 0;
        for (int i = 0; i < a.length; i++) {
            job[i][0] = a[i];
            job[i][1] = b[i];
            days = Math.max(days, a[i]);
        }
        int[] d = new int[days];
        Arrays.sort(job, Comparator.comparingDouble(o -> o[1]));
        int profit = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int ind = job[i][0] - 1;
            while (ind >= 0 && d[ind] == -1) {
                ind--;
            }
            if (ind >= 0 && d[ind] == 0) {
                d[ind] = -1;
                profit += job[i][1];
            }
        }
        System.out.println(profit);
    }
}
