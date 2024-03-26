public class RightRotate2d {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rightrotate(a);}
    static void rightrotate(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            int low = 0;
            int high = a.length - 1;
            while (low < high) {
                int temp = a[i][low];
                a[i][low] = a[i][high];
                a[i][high] = temp;
                low++;
                high--;

            }
            

        }
        for (int k=0;k<a.length;k++){
            for(int j=0;j<a[k].length;j++){
                System.out.print(a[k][j]+" ");
            }
        }

    }
}
