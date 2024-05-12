class Stairsdp {
    public int climbStairs(int n) {
        
        int dp[]=new int[n+1];
    //     Arrays.fill(dp,-1);
    //    climb(n,dp);
    //    return dp[n];
    dp[0]=1;
    dp[1]=2;
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n-1];
    }
    public int climb(int n,int[]dp){

         if (n==0) return 1;
        if (n==-1) return 0;
        if (dp[n]!=-1) return dp[n];
        int a=climb(n-2,dp);
        int b=climb(n-1,dp);
        return dp[n]=a+b;
    }
}