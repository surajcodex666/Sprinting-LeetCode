class Solution {
    public String makeSmallestPalindrome(String s) {

        char[] c = s.toCharArray();
        int n = c.length;

        int l = 0, r = n-1;

        while(l < r){
            if(c[l] != c[r]){
                char small = (char)Math.min(c[l],c[r]);

                c[l] = small;
                c[r] = small;


            }
            l++;
            r--;
        }
        return String.valueOf(c);
        
    }
}