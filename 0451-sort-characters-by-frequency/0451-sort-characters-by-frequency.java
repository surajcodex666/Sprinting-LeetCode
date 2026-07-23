class Pair {

    char ch;
    int freq;

    Pair(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

class Solution {

    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Max Heap
        PriorityQueue<Pair> maxHeap =
                new PriorityQueue<>((a, b) -> b.freq - a.freq);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            maxHeap.offer(new Pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder ans = new StringBuilder();

        while (!maxHeap.isEmpty()) {

            Pair p = maxHeap.poll();

            for (int i = 0; i < p.freq; i++) {
                ans.append(p.ch);
            }
        }

        return ans.toString();
    }
}