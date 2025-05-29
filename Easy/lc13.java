public class lc13 {
    public static void main(String[] args) {
        Solution13 s=new Solution13();
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}
class Solution13 {
    public int romanToInt(String s) {
        int num=0;
        for(int i=0; i<s.length(); i++){
            switch (s.charAt(i)){
                case 'I':
                    if(i<s.length()-1){
                        if(s.charAt(i+1)=='V'){
                            num+=4; i++; break;
                        }
                        if(s.charAt(i+1)=='X'){
                            num+=9; i++; break;
                        }
                    }
                    num+=1; break;
                case 'V': num+=5; break;
                case 'X':
                    if(i<s.length()-1) {
                        if (s.charAt(i + 1) == 'L') {
                            num += 40;
                            i++;
                            break;
                        }
                        if (s.charAt(i + 1) == 'C') {
                            num += 90;
                            i++;
                            break;
                        }
                    }
                    num+=10; break;
                case 'L': num+=50; break;
                case 'C':
                    if(i<s.length()-1) {
                        if (s.charAt(i + 1) == 'D') {
                            num += 400;
                            i++;
                            break;
                        }
                        if (s.charAt(i + 1) == 'M') {
                            num += 900;
                            i++;
                            break;
                        }
                    }
                    num+=100; break;
                case 'D': num+=500; break;
                case 'M': num+=1000; break;
            }
        }
        return num;
    }
}