public class practice1 {
    public static void main(String[] args) {
        SolutionP1 s=new SolutionP1();
        System.out.println(s.gcdOfOddEvenSums(4));
    }
}
class SolutionP1 {
    public int gcdOfOddEvenSums(int n) {
        int even=0,odd=0;
        for(int i=1; i<=2*n; i++){
            if(i%2==0)
                even+=i;
            else
                odd+=i;
        }
        return gcd(even,odd);
    }
    int gcd(int n1, int n2){
        if (n2 == 0) {
            return n1; // Base case
        }
        return gcd(n2, n1%n2);
    }
}