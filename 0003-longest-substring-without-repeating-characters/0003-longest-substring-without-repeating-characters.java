class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[256];
        java.util.Arrays.fill(lastSeen, -1);

        int maxLen = 0;
        int left = 0;
        for(int r = 0; r< s.length(); r++){
            char ch = s.charAt(r);
            if(lastSeen[ch] >= left){
                left = lastSeen[ch] + 1;
            }
            lastSeen[ch] = r;
            maxLen = Math.max(maxLen, r - left + 1);
        }
        return maxLen;
    }
}