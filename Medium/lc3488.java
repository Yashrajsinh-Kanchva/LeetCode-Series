import java.util.*;

public class lc3488 {
    public static void main(String[] args) {
        Solution3488 s=new Solution3488();
        System.out.println(s.solveQueries(new int[]{1,3,1,4,1,3,2}, new int[]{0,3,5}));
    }
}
class Solution3488 {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        int n=nums.length;

        for(int i=0; i<n; i++){
            if(hm.containsKey(nums[i])){
                hm.get(nums[i]).add(i);
            }else{
                ArrayList<Integer> al=new ArrayList<>();
                al.add(i);
                hm.put(nums[i],al);
            }
        }

        List<Integer> ans=new ArrayList<>();
        for (int j : queries) {
            if (hm.get(nums[j]).size() == 1) {
                ans.add(-1);
            } else {
                List<Integer> l = hm.get(nums[j]);
                int pos= Collections.binarySearch(l,j);

//                int nextIndex=(pos+1)%l.size();
//                int prevIndex=((pos-1)+l.size())%l.size();

                int next=l.get((pos+1)%l.size());
                int prev=l.get(((pos-1)+l.size())%l.size());

                int nextGap = Math.min(
                        Math.abs(j-next), n-Math.abs(j-next)
                );
                int prevGap=Math.min(
                        Math.abs(j-prev), n-Math.abs(j-prev)
                );
                ans.add(Math.min(nextGap,prevGap));
            }
        }

        return ans;
    }
}