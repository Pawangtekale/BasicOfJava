class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        // Also numbers ending in 0 (except 0 itself) can't be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();  //  Create an object of Solution

        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        System.out.println(num1 + " is palindrome? " + sol.isPalindrome(num1));  // true
        System.out.println(num2 + " is palindrome? " + sol.isPalindrome(num2));  // false
        System.out.println(num3 + " is palindrome? " + sol.isPalindrome(num3));  // false
    }
}

