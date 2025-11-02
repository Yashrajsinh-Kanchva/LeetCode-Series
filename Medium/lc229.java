import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class lc229 {
    public static void main(String[] args) {
        Solution229 s=new Solution229();
        System.out.println(s.majorityElement(new int[]{3,2,3}));
    }
}
class Solution229 {
    public List<Integer> majorityElement(int[] nums) {
        Hashtable<Integer, Integer> hm=new Hashtable<>();
        for(int i: nums){
            if(hm.containsKey(i)){
                int n=hm.get(i);
                hm.replace(i, ++n);
            }
            else{
                hm.put(i, 1);
            }
        }
        int l=nums.length/3;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:hm.keySet()){
            if(hm.get(i)>l)
                al.add(i);
        }
        return al;
    }
}
