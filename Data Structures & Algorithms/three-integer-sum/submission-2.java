class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                ArrayList<Integer> triplet = new ArrayList<>();
                int sum = nums[left] + nums[right];
                if (sum < -nums[i]) {
                    left++;
                    continue;
                } else if (sum > -nums[i]) {
                    right--;
                    continue;
                } else {
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    if (!solution.contains(triplet)) {
                        solution.add(triplet);
                    }
                    left++;
                    right--;
                }
            }
        }
        return solution;
    }
}
