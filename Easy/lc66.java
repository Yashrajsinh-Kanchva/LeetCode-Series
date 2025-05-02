public class lc66 {
    public static void main(String[] args) {
        int[] digits={9};
        Solution66 obj=new Solution66();
        int[] n=obj.plusOne(digits);
        for(int x : n){
            System.out.println(x);
        }
    }
    
}
/* class Solution {
    public int[] plusOne(int[] digits) {
        /* int sum=0;
        for(int i=0; i<digits.length; i++){
            sum=(sum*10)+digits[i];
        }
        sum++;
        int sums=sum;
        int count=0;
        while(sums>0){
            count++;
            sums/=10;
        }
        if(count>digits.length){
            digits=new int[count];
            for(int i=digits.length-1; i>=0; i--){
                digits[i]=sum%10;
                sum/=10;
            }
        }
        else{
            for(int i=digits.length-1; i>=0; i--){
                digits[i]=sum%10;
                sum/=10;
            }
        }
        return digits; */
        /* for(int i=digits.length-1; i>=0; i++){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] n=new int[digits.length+1];
        n[0]=1;
        return n; */
        class Solution66 {
            public int[] plusOne(int[] digits) {
                for (int i = digits.length - 1; i >= 0; i--) {
                    if (digits[i] < 9) {
                        digits[i]++;
                        return digits;
                    }
                    digits[i] = 0;
                }
                int[] newNumber = new int[digits.length + 1];
                newNumber[0] = 1;
                return newNumber;
            }
        }
        

