

import java.util.*;

public class Dfs {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        
        int n = game.length;
        boolean[] visited = new boolean[n];

        // Depth-first search to check if we can reach the end
        return dfs(0, leap, game, visited);
    }

    private static boolean dfs(int pos, int leap, int[] game, boolean[] visited) {
        if (pos < 0 || pos >= game.length || game[pos] == 1 || visited[pos]) {
            return false;
        }

        if (pos + leap >= game.length || pos == game.length - 1) {
            return true;
        }

        visited[pos] = true;
        return dfs(pos + 1, leap, game, visited) ||
               dfs(pos - 1, leap, game, visited) ||
               dfs(pos + leap, leap, game, visited);
    

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
} 