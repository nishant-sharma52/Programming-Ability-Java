import java.util.*;

class Solution {

    public List<Integer> commonElements(List<Integer> A,
                                        List<Integer> B,
                                        List<Integer> C){

        List<Integer> res=new ArrayList<>();
        int i=0,j=0,k=0;

        while(i<A.size() && j<B.size() && k<C.size()){

            int a=A.get(i),b=B.get(j),c=C.get(k);

            if(a==b && b==c){
                if(res.size()==0||res.get(res.size()-1)!=a)
                    res.add(a);
                i++;j++;k++;
            }
            else if(a<b) i++;
            else if(b<c) j++;
            else k++;
        }

        if(res.size()==0) res.add(-1);
        return res;
    }
}
