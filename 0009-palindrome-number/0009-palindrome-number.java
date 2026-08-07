class Solution {
    public boolean isPalindrome(int x) {

        int duplicate = x;
        int revOrder = 0;
        while(x != 0){
            int lastDigit = x % 10;

            if (x < 0) {
                return false;
            }


            revOrder = (revOrder * 10) + lastDigit;
            
            x = x / 10;
        }
        if(duplicate == revOrder){
            return true;
        }
        else{
            return false;
        }
    }
}