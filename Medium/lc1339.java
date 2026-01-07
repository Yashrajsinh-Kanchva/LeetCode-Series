public class lc1339 {
    public static void main(String[] args) {
        TreeNode1339 root=new TreeNode1339(1);
        root.left=new TreeNode1339(2);
        root.right=new TreeNode1339(3);
        root.left.left=new TreeNode1339(4);
        root.left.right=new TreeNode1339(5);
        root.right.left=new TreeNode1339(6);
        Solution1339 s=new Solution1339();
        System.out.println(s.maxProduct(root));
    }
}
class Solution1339 {
    long totalSum=0;
    long maxProd=0;
    public int maxProduct(TreeNode1339 root) {
        totalSum=sum(root);
        sum(root);
        return (int)(maxProd%1000000007);
    }
    public long sum(TreeNode1339 root){
        if(root==null) return 0;
        long subSum=root.val+sum(root.left)+sum(root.right);
        if(totalSum>0){
            maxProd=Math.max(maxProd, subSum*(totalSum-subSum));
        }
        return subSum;
    }
}
class TreeNode1339 {
    int val;
    TreeNode1339 left;
    TreeNode1339 right;

    TreeNode1339(int val) { this.val = val; }
}