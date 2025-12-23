import java.util.Hashtable;

public class lc73 {
    public static void main(String[] args) {
        Solution73 s=new Solution73();
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        s.setZeroes(matrix);
        for(int[] x: matrix){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
class Solution73 {
    public void setZeroes(int[][] matrix) {
        boolean[] row=new boolean[matrix.length];
        boolean[] col=new boolean[matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if(row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}