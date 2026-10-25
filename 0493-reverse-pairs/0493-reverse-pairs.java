class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0, nums.length - 1);
    }
    public int mergeSort(int [] nums, int low,int high){
        if(low >= high){
            return 0;

        }
        int mid = low + (high - low) / 2;
        int cnt = mergeSort(nums, low, mid);
        cnt += mergeSort(nums, mid + 1, high);
        cnt += CountPairs(nums,low, mid, high);
        merge(nums, low, mid, high);
        return cnt;
    }
    public int CountPairs(int [] nums, int low,int mid,int high){
        int cnt = 0;
        int right = mid + 1;
        for(int i = low; i<= mid; i++){
            while(right <= high && (long) nums[i] > 2L* nums[right]){
                right++;
            }
            cnt += right - (mid + 1);
        }
        return cnt;
    }
    public void merge(int[] nums, int low,int mid,int high){
        int [] temp = new int[high - low + 1];
        int i = low;
        int j =mid + 1;
        int k = 0;
        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }
            else {
                temp[k++] = nums[j++];
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= high){
            temp[k++] = nums[j++];
        }
        for(int p = 0; p <temp.length; p++){
            nums[low + p] = temp[p];
        }
    }
}