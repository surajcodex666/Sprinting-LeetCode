class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        int lb = lb(nums, n, target);

        if (lb == n || nums[lb] != target) {
            return new int[] { -1, -1 };
        }
        int ub = ub(nums, n, target);
        
        return new int[] { lb, ub - 1 };
    }

    public int lb(int[] nums, int n, int target) {

        n = nums.length;

        int l = 0, h = n - 1;
        int ans = n;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public int ub(int[] nums, int n, int target) {

        n = nums.length;

        int l = 0, h = n - 1;
        int ans = n;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] > target) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}