class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int nums : nums2){
            if(set1.contains(nums)){
                ans.add(nums);
            }
        }

        int [] arr = new int[ans.size()];
        int index = 0;

        for(int nums : ans){
            arr[index] = nums;
            index++;
        }
        return arr;
        
        
    }
}