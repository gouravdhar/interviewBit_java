public class Solution {
    String a,b;
    int rec(int i, int j){
        if(i<0 || j<0){
            return 0;
        }
        if(a.charAt(i) == b.charAt(j)){
            return 1+rec(i-1, j-1);
        }
        return Math.max(rec(i-1,j), rec(i,j-1));
    }
    public int solve(String A, String B) {
        a = A;
        b = B;
        int n = a.length();
        int m = b.length();
        return rec(n-1,m-1);
    }
}
