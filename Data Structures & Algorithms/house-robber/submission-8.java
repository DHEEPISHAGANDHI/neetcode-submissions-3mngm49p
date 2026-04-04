class Solution {

    private int dfs(int i, int[] nums, int[] dp) {
        if (i >= nums.length) return 0;

        if (dp[i] != -1) return dp[i];

        int rob = nums[i] + dfs(i + 2, nums, dp);
        int skip = dfs(i + 1, nums, dp);

        return dp[i] = Math.max(rob, skip);
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return dfs(0, nums, dp);
    }
}