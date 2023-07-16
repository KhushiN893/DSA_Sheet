class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
        StringBuilder res = new StringBuilder();
        int cnt = 0;
        
        for (int i = 0; i < strs[0].length(); i++) {
            cnt = 0;
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    cnt++;
                }
            }
            
            if (cnt == strs.length) {
                res.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        
        return res.toString();
    }
}
