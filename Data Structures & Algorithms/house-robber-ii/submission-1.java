class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;
        if(n==1) return nums[0];
       int rob1=robber(nums,0,n-2);
       int rob2=robber(nums,1,n-1);
       return Math.max(rob1,rob2);
    }
    private int robber(int[] nums,int start,int end)
    {
         int prev2 = 0;
        int prev1 = 0;

        for (int i=start;i<=end;i++) {
            int curr = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}

