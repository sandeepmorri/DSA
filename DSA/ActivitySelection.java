import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int a[][] = { { 2, 3 }, { 3, 4 }, { 4, 5 }, { 6, 7 } };
        activitySelection(a);
    }
    public static void activitySelection(int[][] a) {
        Arrays.sort(a, Comparator.comparingDouble(o -> o[1]));
        int activities = 1;
        int end = a[0][1];
        for (int i = 1; i < a.length; i++) {
            if (a[i][0] < end) {
                activities++;
                end = a[i][1];
            }
        }
        System.out.println(activities);
    }
}
