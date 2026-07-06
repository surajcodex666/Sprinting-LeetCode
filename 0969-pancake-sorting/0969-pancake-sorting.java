class Solution {
    public List<Integer> pancakeSort(int[] arr) {

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;

        for (int end = n - 1; end > 0; end--) {

            // Find index of maximum element from 0 to end
            int maxIndex = 0;

            for (int i = 1; i <= end; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            // If maximum is already in correct position
            if (maxIndex == end) {
                continue;
            }

            // Flip maximum element to front
            reverse(arr, 0, maxIndex);
            ans.add(maxIndex + 1);

            // Flip maximum element to its correct position
            reverse(arr, 0, end);
            ans.add(end + 1);
        }

        return ans;
    }

    private void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}