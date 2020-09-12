public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int n= A.size();
        if(n<=0){
            return 0;
        }
        int maxSum = A.get(0);
        int curSum = A.get(0);
        curSum = (curSum < 0) ? 0 : curSum;
        for(int i=1;i<n;i++){
            curSum+=A.get(i);
            maxSum = Math.max(curSum, maxSum);
            curSum = (curSum < 0) ? 0 : curSum;
        }
        return maxSum;
    }
}
