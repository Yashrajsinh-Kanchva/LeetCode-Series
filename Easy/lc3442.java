public class lc3442 {
    public static void main(String[] args) {
        Solution3442 s=new Solution3442();
        System.out.println(s.maxDifference("abcabcab"));
    }
}
class Solution3442 {
    public int maxDifference(String s) {
        // For understanding purpose, it takes more time as compare to actual code.

//        Hashtable<Character, Integer> ht=new Hashtable<>();
//
//        for(int i=0; i<s.length(); i++){
//            if(ht.containsKey(s.charAt(i))){
//                int n1=ht.get(s.charAt(i));
//                ht.replace(s.charAt(i), ++n1);
//            }else{
//            ht.put(s.charAt(i), 1);}
//        }
//        int maxOdd=1, minEven=s.length();
//        for(Character c: ht.keySet()){
//            int n= ht.get(c);
//            if(n%2!=0)
//                maxOdd=Math.max(maxOdd, n);
//            else
//                minEven=Math.min(minEven, n);
//        }
//        return maxOdd-minEven;

        int[] character=new int[26];
        for(int i=0; i<s.length(); i++){
            character[s.charAt(i)-'a']++;
        }

        int maxOdd=1, minEven=s.length();
        for(int i: character){
            if(i%2!=0)
                maxOdd=Math.max(maxOdd, i);
            else
                minEven=Math.min(minEven, i==0? s.length() : i);
        }

        return maxOdd-minEven;
    }
}
