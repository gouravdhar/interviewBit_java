public class Solution {
    String a,b;
    ArrayList<ArrayList<Integer>> dp;
    int rec(int i, int j){
         if(i<0 || j<0){
            return 0;
        }
        
        if(dp.get(i).get(j) != -1){
            return dp.get(i).get(j);
        }
        
        if(a.charAt(i) == b.charAt(j)){
            if(i==0 || j==0){
                dp.get(i).set(j,1);
                return dp.get(i).get(j);
            }
            dp.get(i).set(j, 1+ rec(i-1, j-1));
            return dp.get(i).get(j);
        }
        
        dp.get(i).set(j, Math.max(rec(i-1, j), rec(i,j-1)) );
        return dp.get(i).get(j);
    }
    public int solve(String A, String B) {
        a = A;
        b = B;
        int n = a.length();
        int m = b.length();
        
        dp = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            dp.add(new ArrayList<Integer>());
            for(int j=0; j<=m;j++){
                    dp.get(i).add(j,-1);
            }
        } 
        return rec(n-1, m-1);
        
    }
}
