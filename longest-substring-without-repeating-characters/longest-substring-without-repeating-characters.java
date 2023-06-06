import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        /* --- native attempt --- */

        char[] arr = s.toCharArray();
        
        int res = 0;

        for (int i = 0; i < arr.length - res; i++) {

            HashSet<Character> hashSet = new HashSet<Character>();
            int temp = 0;

            for (int j = i; j < arr.length; j++) {

                if (!hashSet.contains(arr[j])) {

                    hashSet.add(arr[j]);
                    temp += 1;
                }
                else { break; }
            }
            if (temp > res) { res = temp;}
        }

        return res;
    }
}