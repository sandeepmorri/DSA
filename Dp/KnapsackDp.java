import java.util.Arrays;

public class KnapsackDp {


    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int dp[][]=new int[n+1][W+1];
         for(int i=0;i<=n;i++)
         Arrays.fill(dp[i],-1);
         sol(dp,W,wt,val,n);
         return dp[n][W];
         
    } 
    static int sol(int[][] dp,int W, int wt[], int val[], int n){
        if (W==0 || n==0){
            return 0;
        }
        if (dp[n][W]!=-1){
             return dp[n][W];
         }
         if (wt[n-1]<=W){
             int ans1=val[n-1]+sol(dp,W-wt[n-1],wt,val,n-1);
             int ans2=sol(dp,W,wt,val,n-1);
             return dp[n][W]=Math.max(ans1,ans2);
         }
         else{
             return dp[n][W]=sol(dp,W,wt,val,n-1);
         }
    }

}
