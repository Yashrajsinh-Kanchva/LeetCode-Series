import java.util.ArrayList;
import java.util.List;

public class lc912 {
    public static void main(String[] args) {
        Solution912 s=new Solution912();
        int[] ans=s.sortArray(new int[]{5,1,1,2,0,0});
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
class Solution912{
    public int[] sortArray(int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }
    public void mergeSort(int[] arr, int low, int high){
        // we will use merge sort for this question
        // Merge Sort -> Divide + Merge
        // This method is for divide
        if(low>=high) return;
        int mid=(low+high)/2;

        // 1st half
        mergeSort(arr, low, mid);
        // 2nd half
        mergeSort(arr, mid+1, high);

        // after dividing we need to merge. so, we call method for merging
        merge(arr,low,mid,high);
    }
    public void merge(int[] arr, int low, int mid, int high){
        // we will store sorted numbers from low to high in list
        List<Integer> temp=new ArrayList<>();

        // left is for 1st half of divided arr
        int left=low;
        // right is for 2nd half of divided arr
        int right=mid+1;

        // merging part
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        }

        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }

        // updating arr after sorting numbers from low to high
        for(int i=low; i<=high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}