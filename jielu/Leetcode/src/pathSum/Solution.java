package pathSum;

/**
 * From Leetcode online judge Problem: Path Sum Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path such that adding up all the
 * values along the path equals the given sum.
 * 
 * For example: Given the below binary tree and sum = 22, 
 *            5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
 return true, as there exist a root-to-leaf path 5->4->11->2
 * which sum is 22. Finished on 3/7/2013
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return false;

		return DFS(root, 0, sum);
	}

	public boolean DFS(TreeNode root, int curSum, int sum) {
		boolean hasPath = false;
		curSum += root.val;
		if (root.left == null && root.right == null) {
			if (curSum == sum)
				return true;
		}

		if (root.left != null) {
			hasPath = DFS(root.left, curSum, sum);
		}

		if (!hasPath && root.right != null) {
			hasPath = DFS(root.right, curSum, sum);
		}

		return hasPath;

	}
}