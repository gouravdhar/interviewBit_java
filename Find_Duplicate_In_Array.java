public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
    //Similar to finding beginning of loop in a linked list
        int n=A.size();
        int sl = A.get(0);
        int fst = A.get(A.get(0));
        while(sl!=fst){
            sl=A.get(sl);
            fst=A.get(A.get(fst));
        }
        int st=0;
        while(st!=fst){
            st=A.get(st);
            fst=A.get(fst);
        }
        return st;
    }
}
