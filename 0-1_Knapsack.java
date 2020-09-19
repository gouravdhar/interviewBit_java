public class Solution {
    ArrayList<Integer> val;
    ArrayList<Integer> wt;
    int[][] dp;
    int rec(int n, int C){
        if(n < 0 || C < 0){
            return 0;
        }
        if(dp[n][C] != -1){
            return dp[n][C];
        }
        if(wt.get(n) > C){
            return dp[n][C] = rec(n-1, C);
        }
        return dp[n][C] = Math.max(val.get(n)+rec(n-1, C-wt.get(n)), rec(n-1,C));
    }
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int n=A.size();
        val = A;
        wt = B;
        dp = new int[n][C+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<=C; j++){
                dp[i][j] = -1;
            }
        }
        int ans=rec(n-1,C);
        return ans;
    }
}
