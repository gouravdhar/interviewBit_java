class Pair{
    int a;
    int b;
    
    public Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
};
class sortPairs implements Comparator<Pair>{
    public int compare(Pair p1, Pair p2){
        if(p2.a != p1.a){
            return p1.a - p2.a;
        }
        return p1.b - p2.b;
    }
};
public class Solution{
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int n=arrive.size();
        int count =0 ;
        ArrayList <Pair> stay = new ArrayList <Pair>();
        for(int i=0; i<n; i++){
            stay.add(new Pair(arrive.get(i),1));
            stay.add(new Pair(depart.get(i),-1));
        }
        n = stay.size();
        Collections.sort(stay, new sortPairs());
        for(int i=0; i<n; i++){
            Pair p = stay.get(i);
            // System.out.println(p.a+" "+p.b);
        }
        for(int i=0; i<n; i++){
            Pair p = stay.get(i);
            count += p.b;
            if(count > K){
                return false;
            }
        }
        return true;
    }
}
