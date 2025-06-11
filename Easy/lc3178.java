public class lc3178 {
    public static void main(String[] args) {
        Solution3178 s=new Solution3178();
        System.out.println(s.numberOfChild(4,2));
    }
}
class Solution3178 {
    public int numberOfChild(int n, int k) {
        int index=0;
        boolean b=true;
        for(int i=1; i<=k; i++){
            if(index<n-1 && b) {
                index++;
            }
            else {
                if(index==0){
                    b=true;
                    index++;
                }
                else{
                    b=false;
                    index--;
                }
            }
        }

        return index;
    }
}
