public class lc1051 {
    public static void main(String[] args) {
        Solution1051 s=new Solution1051();
        System.out.println(s.heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
class Solution1051 {
    public int heightChecker(int[] arr) {
        int[] no=arr.clone();
        int n=arr.length;
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        int count=0;
        for(int i=0; i<n; i++){
            if(no[i]!=arr[i])
                count++;
        }

        return count;
    }
}