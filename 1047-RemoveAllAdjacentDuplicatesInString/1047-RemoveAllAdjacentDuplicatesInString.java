// Last updated: 11/10/2025, 10:42:11 PM
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int size = stack.length();

            if (size > 0 && stack.charAt(size - 1) == c) {
                stack.deleteCharAt(size - 1); // remove duplicate
            } else {
                stack.append(c); // push character
            }
        }

        return stack.toString();
    }
}