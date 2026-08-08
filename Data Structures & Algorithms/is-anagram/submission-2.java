class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (!count.containsKey(c)) {
                return false;
            }

            count.put(c, count.get(c) - 1);

            if (count.get(c) == 0) {
                count.remove(c);
            }
        }

        return count.isEmpty();
    }
}