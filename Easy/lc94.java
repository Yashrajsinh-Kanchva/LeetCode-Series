import java.util.LinkedList;
import java.util.List;

public class lc94 {
    public static void main(String[] args) {
        Solution94 s=new Solution94();
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        List<Integer> ans=s.inorderTraversal(root);
        System.out.println(ans);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
class Solution94 {
    static List<Integer> ans;
    public List<Integer> inorderTraversal(TreeNode root) {
        ans=new LinkedList<>();
        inorder(root);
        return ans;
    }

    static void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            ans.add(root.val);
            inorder(root.right);
        }
    }
}