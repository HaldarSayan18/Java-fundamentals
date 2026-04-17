/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
    Input: root = [1,null,2,3]

    Output: [1,3,2]
*/

import java.util.*;

public class Q94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        // Recursion method
            List<Integer> list = new ArrayList<>();
            helper(list, root);
        // Iterative method
            Stack<TreeNode> stack = new Stack<>();
            TreeNode current = root;
            while(current != null || stack.isEmpty()){
                while () {
                    stack.push(current);
                    current = current.left;
                }
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }

        return list;
    }
    void helper(List<Integer> list, TreeNode root){
        if(root == null){
            return;
        }
        helper(list, root.left);
        list.add(root.val);
        helper(list, root.right);
    }


    public static void main(String[] args) {
        TreeNode [] root = {1, null, 2, 3};
        Q94 obj = new Q94();
        obj.inorderTraversal(root);
    }
}
