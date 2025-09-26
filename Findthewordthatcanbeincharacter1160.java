class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];

        // Count letters in chars
        for (char ch : chars.toCharArray())
            count[ch - 'a']++;

        int ans = 0;

        // Check each word
        for (String word : words) {
            int[] feq = new int[26];
            for (char ch : word.toCharArray())
                feq[ch - 'a']++;

            boolean canForm = true;
            for (int i = 0; i < 26; i++) {
                if (feq[i] > count[i]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                ans += word.length();
            }
        }

        return ans;
    }
}
