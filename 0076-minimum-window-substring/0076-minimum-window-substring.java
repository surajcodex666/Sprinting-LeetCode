class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] freq = new int[128];

        // Store frequency of characters in t
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int count = t.length();      // Characters still needed
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If this character is still needed
            if (freq[ch] > 0) {
                count--;
            }

            // Include current character in window
            freq[ch]--; //if the character count is 0 it'll be -1

            // Window contains all required characters
            while (count == 0) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                freq[leftChar]++; //mtlb peeche s element minus krdiya hai to agr kisi element ka occurance pehel -1(mtlb ek baar aa chuka) tha to ab vo 0 ho jaayega

                // Window becomes invalid
                if (freq[leftChar] > 0) {
                    count++;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}
    