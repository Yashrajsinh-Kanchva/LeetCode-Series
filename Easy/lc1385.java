public class lc1385 {
    public static void main(String[] args) {
        Solution1385 s=new Solution1385();
        int[] arr1={4,5,8}, arr2={10,9,1,8};
        System.out.println(s.findTheDistanceValue(arr1,arr2,2));
    }
}
class Solution1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int a1: arr1){
            for(int b1:arr2){
                if(Math.abs(a1-b1)<=d){
                    count--;
                    break;
                }
            }
            count++;
        }
        return count;
    }
}
