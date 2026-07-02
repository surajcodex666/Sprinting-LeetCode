class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;

        while(r<n){
            if(nums[r] % 2 == 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
        return nums;
        
    }
}