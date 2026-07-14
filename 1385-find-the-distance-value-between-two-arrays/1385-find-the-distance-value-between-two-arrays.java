class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int l = 0, r = 0;
        int ans = 0;
        int n = arr1.length;
        int m = arr2.length;

        while(l < n){

            boolean ifThere = true;

            while(r < m){
                if(Math.abs(arr2[r] - arr1[l]) <= d){
                    ifThere = false;
                    break;
                }
                r++;
            }
            

            if(ifThere){
                ans++;
            }
            r = 0;
            l++;


        }
        return ans;
        
    }
}