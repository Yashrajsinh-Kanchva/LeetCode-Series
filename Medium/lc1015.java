public class lc1015 {
    public static void main(String[] args) {
        Solution1015 s=new Solution1015();
        System.out.println(s.smallestRepunitDivByK(19));
    }
}
class Solution1015{
    public int smallestRepunitDivByK(int k){
        if(k%2==0 || k%5==0) return -1;
        int r=0, count=0;
        while(true){
            r=(r*10+1)%k;
            count++;
            if(r==0) return count;
        }
    }
}
