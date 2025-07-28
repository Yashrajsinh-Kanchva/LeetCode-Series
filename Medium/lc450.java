public class lc450 {
    public static void main(String[] args) {
        TreeNode t=new TreeNode(5);
        t.right=new TreeNode(6);
        t.right.right=new TreeNode(7);
        t.left=new TreeNode(3);
        t.left.right=new TreeNode(4);
        t.left.left=new TreeNode(2);
        Solution450 s=new Solution450();
        System.out.println("Before Deletion: ");
        inorder(t);
        s.deleteNode(t, 3);
        System.out.println("\nAfter Deletion: ");
        inorder(t);
    }
    static void inorder(TreeNode node) {
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }
}
class TreeNode {
    int val;
    TreeNode left;TreeNode right;
    TreeNode(int val) { this.val = val; }
}
class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        else{
            if(key<root.val){
                root.left=deleteNode(root.left, key);
            }
            else if(key>root.val){
                root.right=deleteNode(root.right, key);
            }
            else{
                if(root.left==null && root.right==null){
                    root=null;
                }
                else if(root.left==null){
                    root=root.right;
                }
                else if(root.right==null){
                    root=root.left;
                }
                else{
                    TreeNode temp=minNode(root.right);
                    root.val= temp.val;
                    root.right=deleteNode(root.right, temp.val);
                }
            }
        }
        return root;
    }
    TreeNode minNode(TreeNode root) {
        if (root.left != null)
            return minNode(root.left);
        else
            return root;
    }
}
