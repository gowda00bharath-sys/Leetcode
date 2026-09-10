class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;

        int a = -1;
        int b = -1;
        int c = -1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                a = i;
            } else if (s.charAt(i) == 'b') {
                b = i;
            } else {
                c = i;
            }

            int min = Math.min(a, Math.min(b, c));

            if (min != -1) {
                count += min + 1;
            }
        }

        return count;
    }
}