class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long  sec = Long.MIN_VALUE;
        long  thr = Long.MIN_VALUE;
        for(int num : nums){
            if(num == max || num == sec || num == thr){
                continue;
            }
            if(num > max){
                thr = sec;
                sec = max;
                max = num;
            }
            else if(num> sec){
                thr = sec;
                sec = num;
            }
            else if(num > thr){
                thr = num;
            }
        }
        if(thr == Long.MIN_VALUE){
            return (int) max;
        }
        return (int) thr;
    }
}