class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }

    private int atMost(int []nums, int k){
        
        int n = nums.length;
        int l = 0;
        int r = 0;
        int oddCount = 0;
        int cnt = 0; 

        while(r < n){
            oddCount += (nums[r] % 2); //if even it'll give zero if odd it'll give 1

            while(oddCount > k){
                oddCount -= (nums[l] % 2);
                l++;
            }
            cnt = cnt + ( r - l + 1);
            r++;
        }
        return cnt;
    }
}
        
    