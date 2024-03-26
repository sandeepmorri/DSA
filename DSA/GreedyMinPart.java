import java.util.*;
;public class GreedyMinPart {
    public static void main(String args[]){
        int n=500;
        minPartionDenomination(n);
    }
    
        public static void minPartionDenomination(int n) {
            int[] a = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[i] <= n) {
                    while (a[i] <= n) {
                        ans.add(a[i]);
                        n -= a[i];
                    }
                }
            }
            System.out.println(ans);
        }
    }
    
