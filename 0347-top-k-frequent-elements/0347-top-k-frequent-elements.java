class Pair {
    int value;
    int freq;

    Pair(int value, int freq) {
        this.value = value;
        this.freq = freq;
    }
}

class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> minHeap =
                new PriorityQueue<>((a, b) -> a.freq - b.freq);

        // Keep only k most frequent
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            minHeap.offer(new Pair(entry.getKey(), entry.getValue()));

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] ans = new int[k];

        int i = 0;

        while (!minHeap.isEmpty()) {
            ans[i++] = minHeap.poll().value;
        }

        return ans;
    }
}