class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        

        /* --- O(n^2) attempt --- */

        /*

        for ( int i = 0; i < nums.length; i++){

            for ( int j = 1; j < nums.lenght; j++){

                if (nums[i] + nums[j] == target){

                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return null;

        */

        /* --- O(n) attempt --- */

        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int complement = target - nums[i]; 

            if (hashmap.containsKey(complement)){

                return new int[] {hashmap.get(complement), i};
            }

            hashmap.put(nums[i], i);
        }

        return null;

    }
}