class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        int n = nums.length;

        int [] arr = new int [n];

        for( int i = 0; i< n; i++){
            if(nums[i]%2 == 0)
            arr[index++] = nums[i];
        }
        for (int i = 0; i<n; i++){
            if(nums[i] % 2 != 0){
                arr[index++] = nums[i];
            }
        }
        return arr;
        
    }
    
}