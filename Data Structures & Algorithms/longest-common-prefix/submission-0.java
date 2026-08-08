class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = 200;
        String empty = "";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min){
                min = strs[i].length();
            }
        }
        for (int i = 0; i < min; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i)) return empty;
            }
            empty += strs[0].charAt(i);
        }
        return empty;

        
    }
}