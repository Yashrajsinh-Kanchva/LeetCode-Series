public class lc1952 {
    public static void main(String[] args) {
        Solution1952 t=new Solution1952();
        System.out.println(t.isThree(21));
    }
}
class Solution1952 {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0)
                count++;
        }
        if(count==3)
            return true;
        else
            return false;
    }
}
