class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        int n = order.length;
        int m = friends.length;

        int[] visited=new int[101];
        int[] res = new int[m];

        for(int i=0;i<m; i++){
         visited[friends[i]]++;
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            if(visited[order[i]]==1) res[index++]=order[i];
        }

        return res;

    }
}