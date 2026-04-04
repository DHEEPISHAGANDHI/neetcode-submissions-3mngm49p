class Solution {

 public int rob(int[] nums) {
    int n=nums.length;
    if(n==1) return nums[0];

    int[] dp=new int[n];
    dp[0]=nums[0];
    dp[1]=Math.max(nums[0],nums[1]);
       for(int i=2;i<n;i++)
       {
        dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
       }
       return dp[n-1];
 }
       
    
}

// class Solution {

//     private int dfs(int i, int[] nums, int[] dp) {
//         if (i >= nums.length) return 0;

//         if (dp[i] != -1) return dp[i];

//         int rob = nums[i] + dfs(i + 2, nums, dp);
//         int skip = dfs(i + 1, nums, dp);

//         return dp[i] = Math.max(rob, skip);
//     }

//     public int rob(int[] nums) {
//         int[] dp = new int[nums.length];
//         Arrays.fill(dp, -1);
//         return dfs(0, nums, dp);
//     }
// }
