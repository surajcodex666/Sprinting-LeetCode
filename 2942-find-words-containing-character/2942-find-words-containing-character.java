class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = words.length;

        for(int i = 0; i<n; i++){
            String str = words[i];

            for(int j = 0; j< str.length(); j++){
                if(str.charAt(j) == x){
                    list.add(i);
                    break;
                }
            }
        }

        return list;
        
    }
}