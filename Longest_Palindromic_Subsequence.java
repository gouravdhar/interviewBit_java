public class Solution {
    String str;
    int[][] dp;

    int rec(int i,int j){
        if(i > j){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        if(str.charAt(i) == str.charAt(j)){
            if(i == j){
                return dp[i][j] = 1+rec(i+1, j-1);
            }
            return dp[i][j] = 2+rec(i+1, j-1);
        }
        
        return dp[i][j] = Math.max(rec(i, j-1), rec(i+1, j));
    }
    
    public int solve(String A) {
        int n = A.length();
        str = A;
        dp = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                dp[i][j] = -1;
            }
        }
        int ans = rec(0,n-1);
        return ans;
    }
}
