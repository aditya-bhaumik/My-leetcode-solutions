class Solution {
    public boolean isPalindrome(int x) {
        // Handle negative numbers and numbers ending in 0 (excluding 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // For odd-length numbers, we can ignore the middle digit
        return x == reversed || x == reversed / 10;
    }
}
