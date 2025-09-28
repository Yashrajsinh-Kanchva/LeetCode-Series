import java.util.LinkedList;
import java.util.List;

public class lc145 {
    public static void main(String[] args) {
        Solution145 s=new Solution145();
        TreeNode145 root=new TreeNode145(1);
        root.right=new TreeNode145(2);
        root.right.left=new TreeNode145(3);
        List<Integer> ans=s.postorderTraversal(root);
        System.out.println(ans);
    }
}
class TreeNode145{
    int val;
    TreeNode145 left;
    TreeNode145 right;
    TreeNode145(int val){
        this.val=val;
    }
}
class Solution145 {
    static List<Integer> ans;
    public List<Integer> postorderTraversal(TreeNode145 root) {
        ans=new LinkedList<>();
        postorder(root);
        return ans;
    }
    static void postorder(TreeNode145 root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            ans.add(root.val);
        }
    }
}