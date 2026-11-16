 class Solution {

    public boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    public boolean check(String s, int left, int right) {

        // Base condition
        if (left >= right) {
            return true;
        }

        // Skip special characters from left
        if (!Character.isLetterOrDigit(s.charAt(left))) {
            return check(s, left + 1, right);
        }

        // Skip special characters from right
        if (!Character.isLetterOrDigit(s.charAt(right))) {
            return check(s, left, right - 1);
        }

        // Compare characters
        if (Character.toLowerCase(s.charAt(left)) !=
            Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        // Recursive call
        return check(s, left + 1, right - 1);
    }
}