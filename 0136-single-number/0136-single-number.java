class Solution {
    public int singleNumber(int[] nums) {
        int xorr = 0;
        for(int i = 0; i< nums.length; i++){
            xorr = xorr ^ nums[i]; // a ^ a = 0 ex 1 ^ 1 = 0 , o ^ 2 = 2 
        }
        return xorr;
    }
}