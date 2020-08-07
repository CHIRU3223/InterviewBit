public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            a.add((int)Math.pow(A.get(i),2));
            
        }
        Collections.sort(a);
        return a;
    }
}
