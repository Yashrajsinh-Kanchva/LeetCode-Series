import java.util.Scanner;

public class lc74 {
    public static void main(String[] args) {
        int[][] a=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print("a["+i+"]["+j+"] = ");
                a[i][j]=sc.nextInt();
            }
        }
        Solution74 s=new Solution74();
        System.out.println(s.searchMatrix(a, 3));
    }
}
class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][matrix[i].length-1]>=target) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(matrix[i][j]==target){
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
