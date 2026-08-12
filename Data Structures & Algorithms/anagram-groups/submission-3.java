class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> solution = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String key = toKey(strs[i]);
            if (!map.containsKey(key)) {
                ArrayList<String> values = new ArrayList<>();
                values.add(strs[i]);
                map.put(key, values);
            } else {
                    map.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());

    }

    public String toKey(String s) {
        int[] count = new int[26];
        char[] characters = s.toCharArray();
        for (char c: characters) {
            count[c - 'a']++;
        }
        String countStr = Arrays.toString(count);
        return countStr;
    }
}
