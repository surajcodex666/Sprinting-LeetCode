class Solution {
    public boolean validPalindrome(String s) {

        int n = s.length();

        int l = 0, r = n - 1;

        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return ifPalindrome(s,l+1,r) || ifPalindrome(s,l,r-1);
            }
            l++;
            r--;
        
            
        }
        return true;
    }

    private boolean ifPalindrome(String s, int l , int r){

        int n = s.length();

        if(n<2){
            return true;
        }
        
        while(l <r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;

    }
}