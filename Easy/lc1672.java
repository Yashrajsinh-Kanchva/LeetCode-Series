import java.util.Scanner;

public class lc1672 {
    public static void main(String[] args) {
        Solution1672 s=new Solution1672();
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[2][3];
        for(int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print("a["+i+"]["+j+"] : ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(s.maximumWealth(a));
    }
}
class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
