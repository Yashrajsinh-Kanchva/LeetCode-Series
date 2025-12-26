import java.util.Hashtable;
import java.util.Map;

public class lc2483 {
    public static void main(String[] args) {
        Solution2483 s=new Solution2483();
        System.out.println(s.bestClosingTime("YYNY"));
    }
}
class Solution2483 {
    public int bestClosingTime(String customers) {
        char[] ch=customers.toCharArray();
        int[] time=new int[ch.length+1];

        for (char c : ch) {
            if (c == 'Y')
                time[0]++;
        }

        int min=time[0];
        for(int i=1; i<=ch.length; i++){
            if(ch[i-1]=='N')
                time[i]=time[i-1]+1;
            else
                time[i]=time[i-1]-1;

            if(min>time[i])
                min=time[i];
        }

        for(int i=0; i<time.length; i++){
            if(time[i]==min)
                return i;
        }

        return 0;
//          Logic is correct, but it takes more time. So, 2nd method is written above
//        char[] ch=customers.toCharArray();
//        int min=Integer.MAX_VALUE;
//        Hashtable<Integer, Integer> ht=new Hashtable<>();
//        for(int i=0; i<=ch.length; i++){
//            int count=0;
//            for(int j=0; j<i; j++){
//                if(ch[j]=='N'){
//                    count++;
//                }
//            }
//            for(int j=i; j<ch.length; j++){
//                if(ch[j]=='Y'){
//                    count++;
//                }
//            }
//            if(min>count){
//                min=count;
//            }
//            ht.put(i,count);
//        }
//
//        for(int i=0; i<=ch.length; i++){
//            if(ht.get(i)==min)
//                return i;
//        }
//        return 0;
//      "YYNY" -> 2
    }
}