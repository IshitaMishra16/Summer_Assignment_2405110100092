class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            left = Math.max(left, index[ch]);
            maxLength = Math.max(maxLength, right - left + 1);
            index[ch] = right + 1;
        }
        return maxLength;
    }
}