public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int r=a.size();
        int c = a.get(0).size();
        for(int i=0; i<r; i++){
            int flag=0;
            for(int j=0; j<c; j++){
                int num=a.get(i).get(j);
                if(flag == 1){
                    a.get(i).set(j,num-1);
                }
                else if(num == 0){
                    j = -1;
                    flag = 1;
                }
            }
        }
        for(int i=0; i<c; i++){
            int flag=0;
            for(int j=0; j<r; j++){
                int num=a.get(j).get(i);
                if(flag == 1){
                    a.get(j).set(i,0);
                }
                else if(num < 0){
                    j = -1;
                    flag = 1;
                }
            }
        }
        
    }
}
