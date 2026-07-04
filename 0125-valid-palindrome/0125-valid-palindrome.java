class Solution {
    public boolean isPalindrome(String s) {
        
        int n = s.length();
        String s2 = "";
        if(s.length() <= 1) return true;

        for( char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                s2 += ch;
            }
        }
        String s1 = s2.toLowerCase();


        int m = s1.length();

        int l = 0 , r = m - 1;

        while(l < r){
            if(s1.charAt(l) == s1.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}