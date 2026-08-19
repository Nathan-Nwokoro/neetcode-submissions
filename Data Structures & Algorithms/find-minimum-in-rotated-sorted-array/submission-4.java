class Solution {
    public int findMin(int[] nums) {
        // [6, 1, 2, 3, 4, 5]
        // [6, 1, 2]
        // [3, 4, 5, 6, 1, 2]
        int left = 0;
        int right = nums.length - 1;
        int first = nums[0];
        int last = nums[nums.length - 1];
        if (first < last) {
            return first;
        }

        while (left <= right) {
            int middle = left + (right - left)/2;
            if (right - left == 1 && nums[right] > nums[left]) {
                return nums[left];
            } else if (right - left == 1 && nums[right] < nums[left]){
                return nums[right];
            }
            if (nums[middle] > nums[left]) {
                left = middle;
            } else if (nums[middle] < nums[left] && nums[middle - 1] < nums[middle]) {
                right = middle;
            } else {
                return nums[middle];
            }
        }
        return -1;

        
    }
}
