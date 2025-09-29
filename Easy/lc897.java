public class lc897 {
    public static void main(String[] args) {
        Solution897 s=new Solution897();
        TreeNode897 root=new TreeNode897(5);
        root.right=new TreeNode897(1);
        root.right.left=new TreeNode897(7);
        TreeNode897 ans=s.increasingBST(root);
        inorder(ans);
    }
    static void inorder(TreeNode897 root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }
}
class TreeNode897{
    int val;
    TreeNode897 left;
    TreeNode897 right;
    TreeNode897(int val){
        this.val=val;
    }
}
class Solution897 {
    static TreeNode897 temp;
    public TreeNode897 increasingBST(TreeNode897 root) {
        TreeNode897 dummy = new TreeNode897(0);
        temp = dummy;
        inorder(root);
        return dummy.right;
    }
    static void inorder(TreeNode897 root){
        if(root!=null){
            inorder(root.left);
            temp.right = root;
            root.left = null;
            temp = root;
            inorder(root.right);
        }
    }
}
