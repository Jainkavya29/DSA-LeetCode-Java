class Solution {
    public void rotate(int[] nums, int d){
        int n = nums.length;
        d = d % n;
        reverse(nums, 0, n - 1);
        reverse(nums,0, d - 1);
        reverse(nums, d, n - 1);
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}