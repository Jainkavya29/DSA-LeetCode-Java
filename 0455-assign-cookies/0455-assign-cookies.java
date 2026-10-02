class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // s >= g
        int n = g.length;
        int m = s.length;
        int l = 0;
        int  r = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l < m && r < n){
            if(g[r] <= s[l]){
                r = r + 1;
            } 
            l = l + 1;
        }
        return r;
        
    }
}