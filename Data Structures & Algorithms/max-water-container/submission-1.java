class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length - 1;
        while (right > left) {
            int min = heights[left];
            if (heights[right] < heights[left]) {
                min = heights[right];
            }
            int vol = min * (right - left);
            if (vol > max) {
                max = vol;
            }
            if (min == heights[left]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
        
    }
}
