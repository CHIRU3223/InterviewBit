public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        ArrayList<Integer> x1 = new ArrayList<Integer>();
        ArrayList<Integer> y1 = new ArrayList<Integer>();
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size();j++){
                if(a.get(i).get(j)==0){
                    x1.add(i);
                    y1.add(j);
                }
            }
        }
        ArrayList<ArrayList<Integer>> aa=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<a.size();i++){
            if(x1.contains(i)){
                ArrayList<Integer> a1 = new ArrayList<Integer>();
                for(int j=0;j<a.get(i).size();j++)
                    a1.add(0);
                aa.add(a1);
            }
            else{
                ArrayList<Integer> b2=new ArrayList<>();
                for(int j=0;j<a.get(i).size();j++){
                    if(y1.contains(j))
                        b2.add(0);
                    else
                        b2.add(a.get(i).get(j));
                }
                aa.add(b2);
            }
        }
        a.clear();
        for(int i=0;i<aa.size();i++)
            a.add(aa.get(i));
            
    }
}
