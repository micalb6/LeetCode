class Solution {
    public boolean isPalindrome(int x) {
        
        String xString = Integer.toString(x);
        int j = xString.length() - 1;

        for (int i = 0; i < xString.length(); i++){

            if (xString.charAt(i) != xString.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}