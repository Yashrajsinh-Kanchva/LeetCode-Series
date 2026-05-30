import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc315 {
    public static void main(String[] args) {
        Solution315 s=new Solution315();
        System.out.println(s.countSmaller(new int[]{3,1,2,4,1,5,2,6,4}));
    }
}
class Solution315 {
    static class Pair{
        int val;
        int i;
        Pair(int val,int i){
            this.val=val;
            this.i=i;
        }
    }
    public List<Integer> countSmaller(int[] nums) {

        Pair[] arr=new Pair[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=new Pair(nums[i],i);
        }

        int[] count=new int[nums.length];
        mergeSort(arr, count,0, nums.length-1);
        List<Integer> ans=new ArrayList<>();
        for(int i: count){
            ans.add(i);
        }
        return ans;
    }
    public void mergeSort(Pair[] arr,int[] count, int low, int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr,count,low,mid);
        mergeSort(arr,count,mid+1,high);
        merge(arr,count,low,mid,high);
    }
    static void merge(Pair[] arr,int[] count, int low, int mid, int high){
        // int[] temp=new int[high];
        List<Pair> temp=new ArrayList<>();

        int left=low, right=mid+1;
        int rightCount=0;
        while(left<=mid && right<=high){
            if(arr[left].val<=arr[right].val){
                count[arr[left].i]+=rightCount;
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
                rightCount++;
            }
        }
        while(left<=mid){
            count[arr[left].i]+=rightCount;
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }
        for(int j=low; j<=high; j++){
            arr[j]=temp.get(j-low);
        }
    }
}