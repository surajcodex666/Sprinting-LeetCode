class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = words.length;

        for(int i = 0; i<n; i++){
            String str = words[i];
            if(str.contains(String.valueOf(x))) list.add(i);
            }

        return list;
        
    }
}