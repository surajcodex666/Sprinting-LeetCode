class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";
        int n = words.length;
        for(int i = 0; i<n; i++){
            String val = words[i];
            
            int k = val.length();
            int sum = 0;
            for(int j=0; j<k; j++){
                char ch = val.charAt(j);

                int val2 = weights[ch -'a'];
                sum += val2;
                
            }
            int temp = sum%26;
            int temp2 = 25 - temp;
            

            char valueAt = (char)(temp2 +'a');
            ans += valueAt;
        }
        return ans;
        
    }
}