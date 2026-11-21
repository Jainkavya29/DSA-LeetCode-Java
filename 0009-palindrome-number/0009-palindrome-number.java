class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0 || (x % 10 == 0  && x != 0)){
            return false;
        }
        if(x == 0){
            return true;
        }
        int original = x;
        int rev = 0;
        while(x > 0){
            int lastD = x % 10;
            rev = rev * 10 + lastD;
            x = x / 10;
        }
        return original == rev;
    }
}
