class Solution {

    public int splitArray(int[] nums, int k) {

        long low = maxElement(nums);
        long high = arraySum(nums);

        while (low <= high) {

            long mid = low + (high - low) / 2;

            int subarraysRequired = countSubarrays(nums, mid);

            if (subarraysRequired > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) low;
    }

    private long arraySum(int[] nums) {

        long sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    private int maxElement(int[] nums) {

        int max = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
        }

        return max;
    }

    private int countSubarrays(int[] nums, long maxAllowedSum) {

        int subarrays = 1;
        long currentSum = 0;

        for (int num : nums) {

            if (currentSum + num <= maxAllowedSum) {
                currentSum += num;
            } else {
                subarrays++;
                currentSum = num;
            }
        }

        return subarrays;
    }
}