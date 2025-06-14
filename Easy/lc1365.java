import java.util.Hashtable;

public class lc1365 {
    public static void main(String[] args) {
        Solution1365 s=new Solution1365();
        int[]  nums={6,5,4,8};
        int[] result=s.smallerNumbersThanCurrent(nums);
        for(int n: result){
            System.out.print(n+" ");
        }
    }
}
class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
//        Hashtable<Integer, Integer> ht=new Hashtable<>();
//        for (int j : nums) {
//            int count = 0;
//            ht.put(j, count);
//            for (int num : nums) {
//                if (j > num) {
//                    count++;
//                }
//            }
//            ht.replace(j, count);
//        }
//        int[] ans=new int[nums.length];
//        for(int i=0; i< nums.length; i++){
//            ans[i]=ht.get(nums[i]);
//        }
//
//        return ans;

        int[] count=new int[101];
        int[] ans=new int[nums.length];
        for (int num : nums) {
            count[num]++;
        }
        for(int i=1; i<101; i++){
            count[i]+=count[i-1];
        }
        for(int i=0; i< nums.length; i++){
            ans[i]=count[nums[i]-1];
        }
        return ans;
    }
}