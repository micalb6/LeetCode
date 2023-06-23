class Solution {
    public int longestArithSeqLength(int[] nums) {
        
        // dynamic programming

        int result = 2;
        HashMap<Integer, Integer>[] dp = new HashMap[nums.length];

        for (int i = 0; i < nums.length; i++) {

            dp[i] = new HashMap<>();

            for (int j = 0; j < i; j++) {

                int diff = nums[j] - nums[i];
                
                // save number of instances in subsequence with current difference
                dp[i].put(diff, dp[j].getOrDefault(diff, 1) + 1); 
                
                // if number of instances in current subsequence > result, update result
                result = Math.max(result, dp[i].get(diff));
            }
        }
        return result;
    }
}