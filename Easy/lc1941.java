public class lc1941 {
    public static void main(String[] args) {
        Solution1941 o=new Solution1941();
        System.out.println(o.areOccurrencesEqual("aabb"));
    }
}
class Solution1941 {
    public boolean areOccurrencesEqual(String s) {
        for(int i=0; i<s.length(); i++){
            int count=1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                    
                }
            }
            System.out.println(count+" - "+s.charAt(i));
        }
        return true;
    }
}
