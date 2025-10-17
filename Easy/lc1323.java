public class lc1323 {
    public static void main(String[] args) {
        Solution1323 s=new Solution1323();
        System.out.println(s.maximum69Number(9996));
    }
}
class Solution1323 {
    public int maximum69Number (int num) {
//        StringBuilder n=new StringBuilder();
//        n.append(num);
//        int l=n.length();
//        int max=num;
//        for(int i=0; i<l; i++){
//            n=new StringBuilder();
//            n.append(num);
//            char ch=n.charAt(i);
//            if(ch=='6')
//                n.replace(i,i+1,"9");
//            else if(ch=='9')
//                n.replace(i,i+1,"6");
//
//            int temp=Integer.parseInt(n.toString());
//            if(max<temp)
//                max=temp;
//        }
//        return max;

        String s=Integer.toString(num);
        char[] arr=s.toCharArray();
        for(int i=0; i<arr.length; i++)
            if(arr[i]=='6') {
                arr[i] = '9';
                break;
            }
        return Integer.parseInt(new String(arr));
    }
}