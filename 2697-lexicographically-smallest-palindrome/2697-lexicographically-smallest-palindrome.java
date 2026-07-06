class Solution {
    public String makeSmallestPalindrome(String s) {

        char[] c = s.toCharArray();
        int n = c.length;

        int l = 0, r = n-1;

        while(l < r){
            if(c[l] != c[r]){
                if(c[l]<c[r]) {
                    c[r]=c[l];
                }
                else{
                    c[l]=c[r];
                }

            }
            l++;
            r--;
        }
        return String.valueOf(c);
        
    }
}