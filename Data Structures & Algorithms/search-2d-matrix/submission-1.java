class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m - 1;
        int l = 0;
        int r = n - 1;
        int row = 0;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target >= matrix[middle][0] && (target < matrix[middle][n - 1] || target == matrix[middle][n - 1])) {
                row = middle;
                break;
            } else if (target < matrix[middle][0]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        while (l <= r) {
            int middle = l + (r - l) / 2;
            if (matrix[row][middle] == target) {
                return true;
            } else if (matrix[row][middle] < target) {
                l = middle + 1;
            } else {
                r = middle - 1;
            }
        }
        return false;
        
    }
}
