class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostk(nums, k) - atMostk(nums, k - 1);
    }

    public int atMostk(int nums[] , int k){
        
        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        int l = 0 , r = 0 , cnt = 0;

        while(r < n){
            map.put(nums[r] , map.getOrDefault(nums[r] , 0) + 1);

            if(map.get(nums[r]) == 1){ //number do distinct elements left , whenever we get a distinct element we do k--
                k--;
            }

            while(k < 0){ //when k becomes negative shrink the window
                map.put(nums[l] , map.get(nums[l]) - 1 );
                
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                    k++;
                }
                l++;

            }
            cnt += r - l + 1;
            r++;
        }
        return cnt;
    }
}