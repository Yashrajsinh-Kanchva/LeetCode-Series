import java.util.Scanner;

public class lc48 {
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("A["+i+"]["+j+"] :");
                matrix[i][j]= sc.nextInt();
            }
        }
        Solution48 s=new Solution48();
        s.rotate(matrix);
        for(int[] x:matrix){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
class Solution48 {
    public void rotate(int[][] matrix) {
        int[][] result=new int[matrix.length][matrix.length];
        int row=0;
        for(int i= matrix.length-1; i>=0; i--){
            for(int j=0; j< matrix.length; j++){
                result[j][i]=matrix[row][j];
            }
            row++;
        }
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                matrix[i][j]=result[i][j];
            }
        }
    }
}