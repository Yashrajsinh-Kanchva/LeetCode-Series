public class lc2125 {
    public static void main(String[] args) {
        Solution2125 s=new Solution2125();
        System.out.println(s.numberOfBeams(new String[]{"011001","000000","010100","001000"}));
    }
}
class Solution2125 {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int lastCount=1;
        int i=0;
        for(String s:bank){
            int count=0;
            for(char ch:s.toCharArray()){
                if(ch=='1')
                    count++;
            }
            if(i>=1 && count!=0)
                ans+=count*lastCount;
            if(count!=0) {
                lastCount = count;
                i++;
            }

        }
        return ans;
    }
}