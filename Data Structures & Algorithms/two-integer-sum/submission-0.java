class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ele1=0,ele2=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ele1=i;
                    ele2=j;
                }
            }
        }
        return new int[]{ele1,ele2};
    }
}
