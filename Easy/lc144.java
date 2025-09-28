import java.util.LinkedList;
import java.util.List;

public class lc144 {
    public static void main(String[] args) {
        Solution144 s=new Solution144();
        TreeNode144 root=new TreeNode144(1);
        root.right=new TreeNode144(2);
        root.right.left=new TreeNode144(3);
        List<Integer> ans=s.preorderTraversal(root);
        System.out.println(ans);
    }
}
class TreeNode144{
    int val;
    TreeNode144 left;
    TreeNode144 right;
    TreeNode144(int val){
        this.val=val;
    }
}
class Solution144 {
    static List<Integer> ans;
    public List<Integer> preorderTraversal(TreeNode144 root) {
        ans=new LinkedList<>();
        preorder(root);
        return ans;
    }
    static void preorder(TreeNode144 root){
        if(root!=null){
            ans.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
}
