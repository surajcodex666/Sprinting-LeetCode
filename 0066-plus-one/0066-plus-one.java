class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < n; i++) {
            str.append((char)(digits[i] + '0'));
        }

        int carry = 1;

        for(int i = str.length() - 1; i >= 0; i--) {

            int val = str.charAt(i) - '0';

            val += carry;

            if(val > 9) {
                carry = 1;
                val = 0;
            } else {
                carry = 0;
            }

            str.setCharAt(i, (char)(val + '0'));

            if(carry == 0)
                break;
        }

        if(carry == 1) {
            str.insert(0, '1');
        }

        int[] arr = new int[str.length()];

        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        return arr;
    }
}