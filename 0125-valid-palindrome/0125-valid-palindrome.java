class Solution {
    public boolean isPalindrome(String s) {
        String s2 = "";
        if(s.length() < 2) return true;

        for( char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                s2 += ch;
            }
        }

        String s1 = s2.toLowerCase();

        int m = s1.length();
        int l = 0;

            for(int i=l;i<m/2;i++){
            if(s1.charAt(i) != s1.charAt(m-1-i)){
                return false;
            }
        }
        return true;
    }
}