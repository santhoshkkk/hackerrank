package leetcode.tree;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (null != left) {
            builder.append(left.toString());
        } else if (null != right) {
            builder.append(",null");
        }
        builder.append(",").append(val);
        if (null != right) {
            builder.append(right.toString());
        } else if (null != left) {
            builder.append(",null");
        }
        return builder.toString();
    }
}


public class SortedArrayToHeightBalancedBST {
    public static void main(String[] args) {
        System.out.println(sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (null == nums || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int middle = (start + end) / 2;
        return new TreeNode(nums[middle],
                sortedArrayToBST(nums, start, middle - 1),
                sortedArrayToBST(nums, middle + 1, end));
    }
}
