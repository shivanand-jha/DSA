class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        if(n < 2) return -1;
        int max_diff = Integer.MIN_VALUE;
        
        for(int i = 1; i < n; i++) {
            max_diff = Math.max(max_diff, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        
        if(max_diff <= 0) return -1;
        return max_diff;
    }
}