public class lc189 {
    public static void main(String[] args) {
        Solution189 s=new Solution189();
        s.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
}
class Solution189 {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k%=l;
        reverse(nums,0,l-k-1);
        reverse(nums,l-k,l-1);
        reverse(nums,0,l-1);
        // PRINTING ARRAY
//        for(int i:nums){
//            System.out.print(i+" ");
//        }
    }
    void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
