class Solution {
    public void rotate(int[] nums, int d){
        int n = nums.length;
        d = d % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, d - 1);
        reverse(nums, d, n - 1);
    }
    public void reverse(int [] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
