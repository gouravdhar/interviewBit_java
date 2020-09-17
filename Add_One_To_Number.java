public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();
        int carry = 1;
        for(int i=n-1; i>=0; i--){
            carry = (carry + A.get(i));
            A.set(i, carry % 10);
            carry = carry/10;
            if(carry == 0){
                break;
            }
        }
        A.add(0,carry);
        while(A.size() > 0 && A.get(0) == 0){
            A.remove(0);
        }
        return A;
    }
}
