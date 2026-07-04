class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        int n = order.length;
        int m = friends.length;

        int[] res = new int[m];

        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (order[i] == friends[j]) {
                    res[index++] = order[i];
                    break;
                }
            }
        }
        return res;

    }
}