/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Shuruwat mein left pointer 0 par hoga aur right pointer array ke end par
        return createBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode createBST(int[] nums, int left, int right) {
        // Base Case: Agar left pointer right se aage nikal jaye, matlab array ka ye hissa khatam ho gaya
        if (left > right) {
            return null;
        }
        
        // 1. Middle element ka index nikalna (overflow se bachne ke liye ye formula use karte hain)
        int mid = left + (right - left) / 2;
        
        // 2. Middle element ko naya root node banana
        TreeNode node = new TreeNode(nums[mid]);
        
        // 3. Left subtree build karna (left se lekar mid-1 tak)
        node.left = createBST(nums, left, mid - 1);
        
        // 4. Right subtree build karna (mid+1 se lekar right tak)
        node.right = createBST(nums, mid + 1, right);
        
        // Pura subtree banne ke baad node ko return kar dena
        return node;
    }
}
        
