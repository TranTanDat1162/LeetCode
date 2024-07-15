class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Create variable prefix for strs[0] assigned to
        String prefix = strs[0];

        // Loop
        for (String str : strs) {
            // Check if the prefix is appeared in other strs array
            // Update for prefix
            while (str.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        }

        return prefix;
    }
}