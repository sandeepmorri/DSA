public class Transpose {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        transpose(a);}
        public static void transpose(int a[][]) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < i; j++) {
    
                    
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
    
                }
                
            }
    
            for (int k=0;k<a.length;k++){
                for(int j=0;j<a[k].length;j++){
                    System.out.print(a[k][j]+" ");
                }
            }
    
        }
}
