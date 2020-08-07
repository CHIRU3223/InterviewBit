public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        Collections.sort(A);
        int min=1,i=0;
        while(i<A.size()){
            if(A.get(i)==min)
                min++;
            else if(A.get(i)>min)
                break;
            i++;
        }
        return min;
    }
}
