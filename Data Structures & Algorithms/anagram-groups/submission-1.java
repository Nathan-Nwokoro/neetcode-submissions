class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> solution = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i ++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String sorted = new String(word);
            if (!map.containsKey(sorted)) {
                ArrayList<String> words = new ArrayList<>();
                words.add(strs[i]);
                map.put(sorted, words);
            } else {
                map.get(sorted).add(strs[i]);
            }
        }
        for (ArrayList<String> lstOfAnograms: map.values()) {
            solution.add(lstOfAnograms);
        }
        return solution;
    }
}
