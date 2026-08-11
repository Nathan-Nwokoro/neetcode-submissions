class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> solution = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String word = new String(str);
            if (!map.containsKey(word)) {
                ArrayList<String> words = new ArrayList<>();
                words.add(strs[i]);
                map.put(word, words);

            } else {
                map.get(word).add(strs[i]);
            }
        }

        for (ArrayList<String> anagram: map.values()){
            solution.add(anagram);
        }
        return solution;
    }
}
