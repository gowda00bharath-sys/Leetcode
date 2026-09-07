class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;

        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            int index = s.charAt(right) - 'A';
            freq[index]++;

            // Update highest frequency
            maxFreq = Math.max(maxFreq, freq[index]);

            // Number of characters we need to replace
            int changes = (right - left + 1) - maxFreq;

            // Shrink window if too many replacements are needed
            while (changes > k) {

                freq[s.charAt(left) - 'A']--;

                left++;

                changes = (right - left + 1) - maxFreq;
            }

            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}