public class LftRotate {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        lftrot(a);}
    public static void lftrot(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {

            int low = 0;
            int high = a.length - 1;
            while (low < high) {
                int temp = a[low][i];
                a[low][i] = a[high][i];
                a[high][i] = temp;
                low++;
                high--;
            }
        }
        

    }
}
