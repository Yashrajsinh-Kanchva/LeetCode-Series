import java.util.LinkedList;
import java.util.Queue;

public class lc1161 {
    public static void main(String[] args) {
        TreeNode1161 root=new TreeNode1161(1);
        root.left=new TreeNode1161(7);
        root.right=new TreeNode1161(0);
        root.left.left=new TreeNode1161(7);
        root.left.right=new TreeNode1161(-8);
        Solution1161 s=new Solution1161();
        System.out.println(s.maxLevelSum(root));
    }
}
class Solution1161 {
    public int maxLevelSum(TreeNode1161 root) {
        int maxSum=Integer.MIN_VALUE;
        int level=1;
        int ansLevel=1;
        Queue<TreeNode1161> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0; i<size; i++){
                TreeNode1161 n=q.poll();
                sum+=n.val;
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }
            if(sum>maxSum){
                maxSum=sum;
                ansLevel=level;
            }
            level++;
        }
        return ansLevel;
    }
}
class TreeNode1161 {
     int val;
     TreeNode1161 left;
     TreeNode1161 right;

     TreeNode1161(int val) { this.val = val; }
  }
