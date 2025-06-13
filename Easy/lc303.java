public class lc303 {
    public static void main(String[] args) {
        int[] n={-2, 0, 3, -5, 2, -1};
        NumArray n1=new NumArray(n);
        System.out.println(n1.sumRange(0,2));
        System.out.println(n1.sumRange(2,5));
        System.out.println(n1.sumRange(0,5));

    }
}
class NumArray {
    int[] n;
    public NumArray(int[] nums) {
        int length=nums.length;
        n=new int[length];
        n[0]=nums[0];
        for(int i=1; i<length; i++){
            n[i]=nums[i]+n[i-1];
        }
    }

    public int sumRange(int left, int right) {
        if(left==0)
            return n[right];
        return n[right]-n[left-1];
    }
}
