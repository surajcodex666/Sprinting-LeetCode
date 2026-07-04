class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        int n = order.length;
        int m = friends.length;
        int[] res = new int[m];
        int index = 0;
        int i = 0;
        int j = 0;

        while( i < n){
            j = 0;
            while(j < m){
                if(order[i] == friends[j]){
                    res[index++] = order[i];
                    break;
                }
                j++;

            }
            i++;
        }
        return res;
        
    }
}