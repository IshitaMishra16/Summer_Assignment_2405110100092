package Day_5;

class Solution {
    public int compress(char[] chars) {
        int index = 0; // position to write compressed data
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                String countStr = String.valueOf(count);

                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
