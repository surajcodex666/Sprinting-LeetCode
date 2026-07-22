class Pair {
    int diff;
    int value;

    Pair(int diff, int value) {
        this.diff = diff;
        this.value = value;
    }
}

class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a.diff == b.diff) {
                    return b.value - a.value;
                }
                return b.diff - a.diff; //keeping the biger one before
            }
        );

        for (int num : arr) {

            int diff = Math.abs(num - x);

            maxHeap.offer(new Pair(diff, num));

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!maxHeap.isEmpty()) {
            ans.add(maxHeap.poll().value);
        }

        Collections.sort(ans);

        return ans;
    }
}