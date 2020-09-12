public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n=A.size();
        if(n<=1){return 0;}
        int ans=0;
        for(int i=1;i<n;i++){
            ans+=Math.max(Math.abs(A.get(i)-A.get(i-1)),Math.abs(B.get(i)-B.get(i-1)));
        }
        return ans;
    }
}
