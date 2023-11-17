class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int minMaxSum = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            minMaxSum = Math.max(minMaxSum, nums[i] + nums[nums.length - 1 - i]);
        }
        
        return minMaxSum;
    }
}
