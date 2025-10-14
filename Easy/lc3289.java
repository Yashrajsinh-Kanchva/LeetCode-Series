public class lc3289 {
    public static void main(String[] args) {
        Solution3289 s=new Solution3289();
        int[] result=s.getSneakyNumbers(new int[]{0,1,1,0});
        for(int n:result){
            System.out.print(n+" ");
        }
    }
}
class Solution3289 {
    public int[] getSneakyNumbers(int[] nums) {
        int l=nums.length;
        int[] n=new int[l];
        int count=0;
        for(int no:nums){
            n[no]++;
            if(n[no]==2)
                count++;
        }
        int[] ans=new int[count];
        count=0;
        for(int i=0; i<n.length; i++){
            if(n[i]==2)
                ans[count++]=i;
        }
        return ans;
    }
}