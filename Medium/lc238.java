public class lc238 {
    public static void main(String[] args) {
        Solution238 s=new Solution238();
        int[] nums={-1,1,0,-3,3};
        int[] r=s.productExceptSelf(nums);
        for(int n: r){
            System.out.print(n+" ");
        }
    }
}
class Solution238{
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];

        // calculate multiplication of all left values and store it into array(result).
        result[0]=1;
        for(int i=1; i<n; i++){
            result[i]=result[i-1]*nums[i-1];
        }

        // calculate multiplication of all right values
        // and multiply it with left values which is already store in array(result).
        int val=1;
        for(int i=n-1; i>=0; i--){
            result[i]*=val;
            val*=nums[i];
        }

        return result;
    }
}